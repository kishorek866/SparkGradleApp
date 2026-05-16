package com.example

import org.apache.spark.sql.SparkSession

object HelloSpark {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("HelloSpark")
      .master("local[*]")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")


    println("Spark 3.5.8 with Gradle is running!")
    spark.stop()
  }
}
