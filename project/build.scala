import sbt._,Keys._

object build extends Build{

  lazy val root = Project(
    "root",
    file(".")
  ).settings(
    sbtend.Plugin.sbtendSettings ++ Seq(
      sbtend.Plugin.SbtendKeys.xtendSource in Compile := file("foo")
    ) : _*
  )
}
