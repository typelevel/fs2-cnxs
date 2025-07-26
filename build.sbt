ThisBuild / organization := "co.fs2"

ThisBuild / scalaVersion := "3.3.6"
ThisBuild / crossScalaVersions := List("3.3.6", "2.13.16")

ThisBuild / tlBaseVersion := "0.1"

ThisBuild / startYear := Some(2024)
ThisBuild / licenses := List(("MIT", url("http://opensource.org/licenses/MIT")))

lazy val root = tlCrossRootProject.aggregate(core)

lazy val core = crossProject(JVMPlatform, JSPlatform, NativePlatform)
  .in(file("core"))
  .settings(
    name := "fs2-cnxs",
    libraryDependencies ++= Seq(
      "co.fs2" %%% "fs2-io" % "3.13.0-M5",
      "org.typelevel" %%% "munit-cats-effect" % "2.1.0" % Test,
      "org.typelevel" %%% "scalacheck-effect-munit" % "2.0.0-M2" % Test
    )
  )
