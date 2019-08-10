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


fork in Test := true
javaOptions in Test += "-Dconfig.file=conf/test/application.test.conf"
javaOptions in Test += "-Dsecrets.path="+baseDirectory.value+"/conf/test/secret.conf"


scalafmtOnCompile in ThisBuild := true
