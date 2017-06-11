name := "github-analysis"

version := "0.1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided",
  "org.apache.spark" % "spark-graphx_2.11" % "2.1.1",
  "joda-time" % "joda-time" % "2.9.9",
  "com.datastax.spark" % "spark-cassandra-connector_2.11" % "2.0.2"
)