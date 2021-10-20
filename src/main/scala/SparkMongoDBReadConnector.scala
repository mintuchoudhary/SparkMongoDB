import org.apache.spark.sql.SparkSession

object SparkMongoDBReadConnector {
  System.setProperty("hadoop.home.dir", "D:\\Downloads\\hadoop") //bin/winutil.exe

  def main(args: Array[String]): Unit = {
    println("Connecting to MongoDb ..")

    val spark = SparkSession.builder().appName("Mongodb connector")
      .master("local")
      .config("spark.testing.memory", "2147480000")
      .config("spark.network.timeout","90000")
      .config("spark.mongodb.input.uri", "mongodb+srv://mongodb:mongodb@cluster0.jlw8f.mongodb.net/sample_training")
      .config("spark.mongodb.output.uri", "mongodb+srv://mongodb:mongodb@cluster0.jlw8f.mongodb.net/sample_training")
      .getOrCreate()

    val routesDF = spark.read.format("com.mongodb.spark.sql.DefaultSource")
      .option("collection", "routes").load()

    routesDF.show(false)
    routesDF.printSchema()

    spark.close() //
  }
}
