package com.gitmining.analysis.utils

import com.gitmining.analysis.models._
import org.apache.spark.SparkContext
import org.apache.spark.graphx.{Edge, Graph, VertexId}
import org.apache.spark.rdd.RDD

/**
  * Created by weiwang on 09/06/17.
  */
trait GraphUtils {

  import org.apache.spark._
  import com.datastax.spark.connector._

  val KEYSPACE = "gitmining"

  def graph(userColumnFamily:String, repoColumnFamily:String, linkColumnFamily:String)(implicit sc:SparkContext) = {
    val users:RDD[(VertexId, Vertex)] = sc.cassandraTable[User](KEYSPACE, userColumnFamily)
      .repartitionByCassandraReplica(KEYSPACE, userColumnFamily)
      .mapPartitions(_.map(user => (user.id, user)))
    val repos:RDD[(VertexId, Vertex)] = sc.cassandraTable[Repo](KEYSPACE, repoColumnFamily)
      .repartitionByCassandraReplica(KEYSPACE, repoColumnFamily)
      .mapPartitions(_.map(repo => (repo.id, repo)))
    val links = sc.cassandraTable[Link](KEYSPACE, linkColumnFamily)
      .repartitionByCassandraReplica(KEYSPACE, linkColumnFamily)
      .mapPartitions(_.map(link => Edge(link.src,link.dst, (link.`type`,link.w8t))))
    Graph(users ++ repos, links)
  }
}
