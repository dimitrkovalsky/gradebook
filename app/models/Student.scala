package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:30
 */
case class Student(@Key("_id") id: ObjectId, fio: String, idMajorSpeciality: ObjectId, idSpeciality: ObjectId, idGroup: ObjectId,
                   yearOfEntry: Int) {}

object Student{}
