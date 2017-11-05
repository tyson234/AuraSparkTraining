package org.training.spark.util

object KafkaRedisProperties {
  val REDIS_SERVER: String = "bigdata"
  val REDIS_PORT: Int = 6379

  val KAFKA_SERVER: String = "bigdata"
  val KAFKA_ADDR: String = KAFKA_SERVER + ":9092"
  val KAFKA_USER_TOPIC: String = "user_events"
}