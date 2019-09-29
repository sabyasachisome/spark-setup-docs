name:= "spark_Streaming_test"
version:= "0.13"
scalaVersion:= "2.10.6"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.3"
libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.6.3"
libraryDependencies += "org.apache.spark" % "spark-hive_2.10" % "1.6.3"

libraryDependencies ++= Seq(
"org.apache.spark" % "spark-streaming_2.10" % "1.6.3",
"org.apache.spark" % "spark-streaming-twitter_2.10" % "1.6.3"
)