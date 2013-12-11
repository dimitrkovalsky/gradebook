package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:31
 */
case class Subject(@Key("_id") id: Int, name: String, idMajorSpeciality: ObjectId, idSpeciality: ObjectId, idDepartment: ObjectId) {

}

object Subject {

}

case class Module(){
  var points = 0

}
