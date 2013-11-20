package models

import parameters.MongoConfig._
import com.novus.salat.dao._
import com.mongodb.casbah.MongoConnection
import mongoContext._
import com.novus.salat.annotations.raw.Key

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:15
 */
case class Department(@Key("_id") id: Int, title: String) {

}

object Department extends ModelCompanion[Department, Int] {
  val collection = MongoConnection(MONGO_HOST, MONGO_PORT)(MONGO_DB)("departments")

  def dao: DAO[Department, Int] = new SalatDAO[Department, Int](collection = collection) {}
}
