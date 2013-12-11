package preloaders

import models.{Department}
import models.Predefined._
import org.bson.types.ObjectId

/**
 * User: mkontarev
 * Date: 12/10/13
 * Time: 5:35 PM
 */
class DepartmentPreloader extends Preloader {
  def preload(): String = {
    val departments = List(Department(1, "Компьютерні системі управління", institutes(1), new ObjectId(), "+380432123456", "+380432654321", "+380432123123", 1), Department(2, "Захист інформації", institutes(2), new ObjectId(), "+380432789123", "+380432321987", "+380432789789", 2))
    departments.foreach(Department.save)
    s"[DepartmentPreloader] loaded ${departments.size} departments"
  }
}
