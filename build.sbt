import play.Project._

name := "todolist_Scala"

version := "1.0"

playScalaSettings

libraryDependencies ++= Seq(
  jdbc,
  anorm
)