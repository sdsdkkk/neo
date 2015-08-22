organization := "com.github.sdsdkkk"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaVersion = "2.3.12"
  Seq(
    "com.typesafe.akka"   %% "akka-actor"                           % akkaVersion,
    "com.typesafe.akka"   %% "akka-slf4j"                           % akkaVersion
  )
}
