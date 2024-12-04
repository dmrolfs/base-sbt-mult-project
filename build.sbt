import sbt.Keys._


// dependencies
lazy val root =
  ( project in file(".") )
  .enablePlugins( BuildInfoPlugin )
  .settings( 
    buildInfoKeys := Seq[BuildInfoKey]( name, version, scalaVersion, sbtVersion ),
    buildInfoPackage := "base",
    publishArtifact := false 
  )
  .aggregate( core )


lazy val core = ( project in file("./core") )


(Test / fork) := true
(Test / javaOptions) += "-Dconfig.file=conf/test/application.test.conf"
(Test / javaOptions) += "-Dsecrets.path="+baseDirectory.value+"/conf/test/secret.conf"


(ThisBuild / scalafmtOnCompile) := true
