package preloaders

import org.bson.types.ObjectId
import models.Speciality

/**
 * Created with IntelliJ IDEA.
 * User: Maxxis
 * Date: 11.12.13
 * Time: 1:50
 * To change this template use File | Settings | File Templates.
 */
class SpecialityPreloader extends Preloader{
  def preload(): String = {
    val specialities = List(Speciality(new ObjectId(), "Комп’ютеризовані системи управління та автоматика", "КСУА", new ObjectId(), true, "бакалавр"), Speciality(new ObjectId(), "Автоматики та інформаційно-вимірювальної техніки", "АІВТ", new ObjectId(), true, "бакалавр")
    specialities.foreach(Speciality.save)
    s"[SpecialityPreloader] loaded ${specialities.size} specialities"
  }
}
