import sbt._

object Dependencies {
  private val scalaTestVersion = "3.0.0"

  val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % scalaTestVersion
}