ThisBuild / organization := "co.fs2"

ThisBuild / scalaVersion := "3.3.3"
ThisBuild / crossScalaVersions := List("3.3.3", "2.13.12")

ThisBuild / tlBaseVersion := "0.1"

ThisBuild / licenses := List(("MIT", url("http://opensource.org/licenses/MIT")))

lazy val root = tlCrossRootProject.aggregate(core)

lazy val core = crossProject(JVMPlatform, JSPlatform, NativePlatform)
  .in(file("core"))
  .settings(
    name := "fs2-cnxs",
    libraryDependencies ++= Seq(
      "co.fs2" %%% "fs2-io" % "3.10.2",
      "org.typelevel" %%% "munit-cats-effect" % "2.0.0" % Test,
      "org.typelevel" %%% "scalacheck-effect-munit" % "2.0.0-M2" % Test
    )
  )
