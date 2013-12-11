package models

import com.novus.salat.annotations.raw.{Ignore, Key}
import com.mongodb.casbah.commons.Imports._

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:30
 */
<<<<<<< HEAD

case class Group(@Key("_id") id: ObjectId, name: String, department:String) {}
=======
case class Group(@Key("_id") id: ObjectId, name: String, @Ignore students: List[Student]) {}
>>>>>>> 61189d5668d99348156cb05db9b14a8c9b9b8ae6

object Group{}
