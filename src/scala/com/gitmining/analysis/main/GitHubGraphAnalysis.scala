package com.gitmining.analysis.main

import org.apache.spark._
import org.apache.spark.graphx._

/**
  * Created by weiwang on 09/06/17.
  */
object GitHubGraphAnalysis {

  val appName = "Gitmining"
  val sparkMaster = "spark://weiwang-GL552JX:7077"

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName(appName).setMaster(sparkMaster)
    implicit val sc = new SparkContext(conf)


  }

}
