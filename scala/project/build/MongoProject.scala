import sbt._

class MongoProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val scalatraVersion = "2.0.0.M3"
  val scalatra = "org.scalatra" %% "scalatra" % scalatraVersion
  val servletApi = "org.mortbay.jetty" % "servlet-api" % "2.5-20081211" % "provided"
  val liftJson = "net.liftweb" %% "lift-json" % "2.3"
  val slf4jBinding = "ch.qos.logback" % "logback-classic" % "0.9.28" % "runtime"
  val rogue = "com.foursquare" %% "rogue" % "1.0.9" withSources()
  val scalatest = "org.scalatra" %% "scalatra-scalatest" % scalatraVersion % "test"

  override def testClasspath = super.testClasspath +++ buildCompilerJar

  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  val fuseSourceSnapshots = "FuseSource Snapshot Repository" at "http://repo.fusesource.com/nexus/content/repositories/snapshots"
  val stRels = "scalatools-releases" at "http://scala-tools.org/repo-releases"
  val stSnaps = "scalatools-snapshots" at "http://scala-tools.org/repo-snapshots"
}
