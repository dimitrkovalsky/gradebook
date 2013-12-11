package preloaders

import models.{Lecturer, Department}
import models.Predefined._
import org.bson.types.ObjectId

/**
 * User: mkontarev
 * Date: 12/10/13
 * Time: 5:35 PM
 */
class DepartmentPreloader extends Preloader {
  def preload(): String = {
    val departments = List(Department("Компьютерні системі управління", institutes(1), new ObjectId(), "+380432123456", "+380432654321", "+380432123123", 1))
    departments.foreach(Department.save)
    s"[DepartmentPreloader] loaded    $${departments.size} departments"
  }

}
