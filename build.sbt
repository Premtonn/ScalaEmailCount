name:= "StreamingProject"
version := "1.0"
scalaVersion:= "2.12.11"
libraryDependencies++= Seq(
 "org.apache.spark" % "spark-core_2.12" % "3.2.1",
 "org.apache.spark" % "spark-sql_2.12" % "3.2.1",
 "org.apache.spark" % "spark-streaming_2.12" % "3.2.1",
Premton Canamusa
 "org.apache.hadoop" % "hadoop-common" % "2.10.0",
 "org.apache.hbase" % "hbase-client" % "2.4.11",
 "org.apache.hbase" % "hbase-common" % "2.4.11",
 "org.apache.hbase" % "hbase-server" % "2.4.11") 