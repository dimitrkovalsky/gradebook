package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._
import java.util.Date

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:31
 */
case class Mark(@Key("_id") id: ObjectId, data: Date, mark: Int, idStudent: ObjectId, idDiscipline: ObjectId,
                nameOfEvent: String) {}

object Mark {}
