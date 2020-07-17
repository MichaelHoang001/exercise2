package design.hamu.job

import io.circe.Json

trait Job {
  def apply(string: String): Either[Throwable, Json]
}

object Job {

  def apply(string: String): Job = string.toLowerCase match {
    case "greet" => GreetJob
<<<<<<< HEAD
    case "prime" => PrimeJob
=======
>>>>>>> origin/encode
    case "encode" => EncodeJob
  }
}
