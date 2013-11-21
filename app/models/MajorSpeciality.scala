package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._
import java.util.Date

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:29
 */
case class MajorSpeciality(@Key("_id") id: ObjectId, name: String, abbreviation: String, codeSpeciality: String,
                           qualification: String) {}

object MajorSpeciality {}
