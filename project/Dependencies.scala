import sbt._

object Dependencies {

  object Akka {
    private val version = "2.5.22"
    val Stream          = "com.typesafe.akka" %% "akka-stream"           % version
    val Actor           = "com.typesafe.akka" %% "akka-actor"            % version
    val AkkaPersistence = "com.typesafe.akka" %% "akka-persistence"      % version
    val Cluster         = "com.typesafe.akka" %% "akka-cluster"          % version
    val ClusterSharding = "com.typesafe.akka" %% "akka-cluster-sharding" % version
    val TestKit         = "com.typesafe.akka" %% "akka-testkit"          % version
  }

  val ScalaTest     = "org.scalatest"              %% "scalatest"       % "3.0.7"
  val Logback       = "ch.qos.logback"              % "logback-classic" % "1.2.3"
  val scalax        = "com.github.t3hnar"          %% "scalax"          % "3.4"
  val Logging       = "com.typesafe.scala-logging" %% "scala-logging"   % "3.9.2"
  val playJsonTools = "com.evolutiongaming"        %% "play-json-tools" % "0.3.9"
  val Nel           = "com.evolutiongaming"        %% "nel"             % "1.3.3"
  val ScalaTools    = "com.evolutiongaming"        %% "scala-tools"     % "2.0"
  val ConfigTools   = "com.evolutiongaming"        %% "config-tools"    % "1.0.3"

  object Prometheus {
    private val version = "0.6.0"
    val simpleclient = "io.prometheus" % "simpleclient" % version
  }
}