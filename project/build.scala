import sbt._,Keys._

object build extends Build{

  lazy val root = Project(
    "root",
    file("foo")
  ).settings(
    sbtend.Plugin.sbtendSettings:_*
  )
}
