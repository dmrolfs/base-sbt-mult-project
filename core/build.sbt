// import BuildSettings._
import Dependencies._
import sbtassembly.AssemblyPlugin.autoImport.MergeStrategy

name := "core"

// description := "lorem ipsum."

libraryDependencies ++=
  commonDependencies 


addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

testOptions in Test += Tests.Argument( "-oDF" )
