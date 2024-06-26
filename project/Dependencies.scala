import sbt._

object Dependencies {

  object Versions {
    val logback   = "1.5.4"
    val pekko     = "1.0.2"
    val pekkoHttp = "1.0.1"
    val scalaTest = "3.2.18"
    val thrift    = "0.20.0"
  }

  val pekkoHttp = "org.apache.pekko" %% "pekko-http" % Versions.pekkoHttp
  val thrift    = "org.apache.thrift" % "libthrift"  % Versions.thrift

  object Provided {
    val pekkoStream = "org.apache.pekko" %% "pekko-stream" % Versions.pekko % "provided"
  }

  object Test {
    val logback          = "ch.qos.logback"    % "logback-classic"    % Versions.logback   % "test"
    val pekkoHttpTestkit = "org.apache.pekko" %% "pekko-http-testkit" % Versions.pekkoHttp % "test"
    val pekkoTestkit     = "org.apache.pekko" %% "pekko-testkit"      % Versions.pekko     % "test"
    val scalaTest        = "org.scalatest"    %% "scalatest"          % Versions.scalaTest % "test"
  }
}
