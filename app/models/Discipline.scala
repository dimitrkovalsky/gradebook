package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._

/**
 * User: mkontarev
 * Date: 11/21/13
 * Time: 5:46 PM
 */
class Discipline(@Key("_id") id: ObjectId, name: String, idMajorSpeciality: ObjectId, idSpeciality: ObjectId, idDepartment: ObjectId,
                 trimesters: Int, exams: Int, lection: Int, laboratory: Int, practice: Int, seminar: Int, CPC: Int) {}

object Discipline {}