package preloaders

import models.{Lecturer, Department}
import models.Predefined._
import org.bson.types.ObjectId
import java.util.Date

/**
 * User: mkontarev
 * Date: 12/10/13
 * Time: 6:04 PM
 */
class LecturerPreloader extends Preloader {
  def preload(): String = {
    val lectures = List(Lecturer(new ObjectId(), degrees(1), ranks(1), "завідуючий кафедрою КСУ", "Дубовой Володимир Михайлович", new ObjectId(), new Date(), "+3809312345678", 123, "http://lalala"),
      Lecturer(new ObjectId(), degrees(2), ranks(2), "головний лаборант", "Петренко Петро Петрович", new ObjectId(), new Date(), "+3800674321321", 124, "http://lol"))
    lectures.foreach(Lecturer.save)
    s"[LecturerPreloader] loaded ${lectures.size} lectures"
  }

}
