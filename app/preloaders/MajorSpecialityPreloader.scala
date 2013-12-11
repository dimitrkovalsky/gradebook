package preloaders

import models.{MajorSpeciality, Lecturer}
import org.bson.types.ObjectId
import models.Predefined._
import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: Maxxis
 * Date: 11.12.13
 * Time: 1:38
 * To change this template use File | Settings | File Templates.
 */
class MajorSpecialityPreloader extends Preloader{
  def preload(): String = {
    val majorSpecialities = List(MajorSpeciality(new ObjectId(), "Системна інженерія", "СІ", "12324124", "бакалавр"), MajorSpeciality(new ObjectId(), "Метрологія", "МІТ", "999999", "бакалавр"))
    majorSpecialities.foreach(MajorSpeciality.save)
    s"[MajorSpecialityPreloader] loaded ${majorSpecialities.size} majorSpecialities"
  }
}
