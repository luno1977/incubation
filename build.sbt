name := """incubation"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.scala-lang" % "scala-reflect" % "2.11.7",
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.4"
)

// Uncomment to use Akka or add it to the seq above
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

