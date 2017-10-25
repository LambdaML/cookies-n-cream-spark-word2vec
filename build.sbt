val sparkV = "2.2.0"
val sparkArtifact = Seq(
  "org.apache.spark" %% "spark-core_2.10" % sparkV
)

lazy val root = (project in file("."))
  .settings(
    name := "spark-word2vec",
    scalaVersion := "2.12.3",
    libraryDependencies ++= sparkBigArtifact

  ),
