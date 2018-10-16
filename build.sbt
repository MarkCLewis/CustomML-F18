updateOptions := updateOptions.value.withLatestSnapshots(false)

lazy val root = (project in file("."))
  .settings(
    name         := "CustomMLF18",
    organization := "edu.trinity",
    scalaVersion := "2.12.7",
    version      := "0.1.0-SNAPSHOT",
		libraryDependencies += "edu.trinity" %% "swiftvis2" % "0.1.0-SNAPSHOT",
		libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5",
		libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

  )
