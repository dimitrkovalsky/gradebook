package models

import com.novus.salat.annotations.raw.{Ignore, Key}
import com.mongodb.casbah.commons.Imports._

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:30
 */
case class Group(@Key("_id") id: ObjectId, name: String, @Ignore students: List[Student]) {}

object Group{}
