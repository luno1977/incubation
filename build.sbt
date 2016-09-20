lazy val commonSettings = Seq(
  organization := "eu.kedev",
  version := "0.0.1",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    "org.scala-lang" % "scala-reflect" % "2.11.8",
    "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.4",
    "com.typesafe.akka" %% "akka-actor" % "2.3.11"
  )
)

lazy val inc = (project in file(".")).
  aggregate(chessUtils, chessDetect).
  settings(commonSettings: _*).
  settings(
    name := """inc"""
  )

lazy val chessUtils = (project in file("chess/utils")).
  settings(commonSettings: _*).
  settings(
    name := """chess.utils"""
  )

lazy val chessDetect = (project in file("chess/detect")).
  settings(commonSettings: _*).
  settings(
    name := """chess.detect"""
  ).dependsOn(chessUtils)


