package preloaders

import models.Student
import org.bson.types.ObjectId

/**
 * Created with IntelliJ IDEA.
 * User: Maxxis
 * Date: 11.12.13
 * Time: 1:24
 * To change this template use File | Settings | File Templates.
 */
class StudentPreloader extends Preloader{
  def preload(): String = {
    val studens = List(Student(new ObjectId(), "Контарев Максим Геннадьевич", new ObjectId(), new ObjectId(), new ObjectId(), 2013), Student(new ObjectId(), "Яремчук Владимир Владимирович", new ObjectId(), new ObjectId(), new ObjectId(), 2013))
    studens.foreach(Student.save)
    s"[StudentPreloader] loaded ${studens.size} studens"
  }
}
