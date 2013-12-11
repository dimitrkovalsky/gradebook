package preloaders

import models.{Student, Group}
import org.bson.types.ObjectId

/**
 * User: mkontarev
 * Date: 12/11/13
 * Time: 12:31 PM
 */
class GroupPreloader extends Preloader {
  def preload(): String = {
    val groups = List(Group(new ObjectId(), "3СІ-09", List(Student(), Student())), Group(new ObjectId(), "3СІ-09", List(Student(), Student())))
    groups.foreach(Group.save)
    s"[GroupPreloader] loaded ${groups.size} groups"
  }
}
