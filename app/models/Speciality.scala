package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:27
 */
case class Speciality(@Key("_id") id: ObjectId, name: String, abbreviation: String, idMajorSpeciality: ObjectId, masterDegree: Boolean,
  qualification: String) {}

object Speciality {}
