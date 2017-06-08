name := "github-analysis"

version := "0.1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided",
  "org.apache.spark" % "spark-graphx_2.11" % "2.1.1"
)