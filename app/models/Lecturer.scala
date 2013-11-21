package models

import parameters.MongoConfig._
import java.util.Date
import com.novus.salat.dao._
import com.mongodb.casbah.commons.Imports._
import com.mongodb.casbah.MongoConnection
import mongoContext._

import com.novus.salat.annotations.raw.Key

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:14
 */
// (Id, Id_ступінь, Id_звання, ПІБ, Id_посади, Id_кафедри, дат_поч_пед_стажу, тел_внутр, ауд_викл);
case class Lecturer(@Key("_id") id: ObjectId, degree: String, rank: String, position: String, fio: String, departmentId: ObjectId, startTeach: Date,
                   phone: String, classroom: Int, url: String) {}

object Lecturer extends ModelCompanion[Lecturer, Int] {
  val collection = MongoConnection(MONGO_HOST, MONGO_PORT)(MONGO_DB)("teachers")

  def dao: DAO[Lecturer, Int] = new SalatDAO[Lecturer, Int](collection = collection) {}

  def findByUrl(url: String): Option[Lecturer] = {

    dao.findOne(MongoDBObject("url" -> url))
  }
}
