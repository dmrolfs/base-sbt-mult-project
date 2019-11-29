// see: https://github.com/sbt/sbt-git#known-issues
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"

logLevel := Level.Warn

addSbtPlugin("com.eed3si9n"                      % "sbt-assembly"           % "0.14.10")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"          % "0.9.0")
addSbtPlugin("com.github.gseitz"                 % "sbt-release"            % "1.0.11")
addSbtPlugin("org.scalameta"                    % "sbt-scalafmt"           % "2.0.3")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"       % "3.0.0")
addSbtPlugin("com.timushev.sbt"                  % "sbt-updates"            % "0.4.3")
addSbtPlugin("com.typesafe.sbt"                  % "sbt-git"                % "1.0.0")
addSbtPlugin("net.virtual-void"                  % "sbt-dependency-graph"   % "0.9.2")
addSbtPlugin("org.scalastyle"                    %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "2.0.0-RC2-1")

addSbtPlugin("org.scoverage"                     % "sbt-scoverage"          % "1.6.0")
//addSbtPlugin("org.scoverage" %% "sbt-coveralls" % "1.1.0")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.5.0")
addSbtPlugin("com.tapad" % "sbt-docker-compose" % "1.0.34")

// addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.3.11")

