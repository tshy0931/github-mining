package com.gitmining.analysis.models

/**
  * Created by weiwang on 09/06/17.
  */
object Repo {

}

case class Repo(
               id:Long,
               name:String,
               ownerId:Long,
               ownerName:String,
               orgId:Long,
               orgName:String,
               assignees:Set[Long],
               language:String,
               languages:Map[String, Long],
               issues:Set[Long],
               openIssuesCount:Int,
               createdAt:String, //DateTime,
               updatedAt:String, //DateTime,
               pushedAt:String, //DateTime,
               size:Long,
               networkCount:Int,
               forks:Set[Long]=Set(),
               forksCount:Int=0,
               collaborators:Set[Long]=Set(),
               collaboratorsCount:Int=0,
               stargazers:Set[Long]=Set(),
               starCount:Int=0,
               contributors:Set[Long]=Set(),
               contributorsCount:Int=0,
               subscribers:Set[Long]=Set(),
               subscribersCount:Int=0
               ) extends Vertex
