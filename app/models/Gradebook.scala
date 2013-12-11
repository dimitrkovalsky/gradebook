package models

import com.novus.salat.annotations.raw.Key
import com.mongodb.casbah.commons.Imports._
import java.util.Date

/**
 * User: Dimitr
 * Date: 11.12.13
 * Time: 11:09
 */
case class GeneralMarks(subjectId: Int, marks: scala.collection.mutable.Map[ObjectId, Int])

case class Mark(data: Date, mark: Int, studentId: ObjectId, subjectId: Int, nameOfEvent: String) {}

class Gradebook(id: ObjectId, subject: Subject, group: Group, var marks: List[Mark] = Nil) {
  def addMark(mark: Mark) {
    marks = marks ::: List(mark)
  }

  def generalResult(): GeneralMarks = {
    val map = scala.collection.mutable.Map[ObjectId, Int]()
    marks.foreach(m => {
      val mark: Int = map.get(m.studentId).map {
        mark => mark + m.mark
      }.getOrElse(m.mark)
      map += m.studentId -> mark
    })
    GeneralMarks(subject.id, map)
  }
}


case class GradebookPersist(@Key("_id") id: ObjectId, subjectId: ObjectId, groupId: ObjectId, marks: List[Mark]) {

}
