package controllers

import models.Group
import org.bson.types.ObjectId
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.json.Reads._
import play.api.libs.json.Writes._

object Application extends Controller {

  implicit val groupWrites = new Writes[Group] {
    def writes(g: Group): JsValue = {
      Json.obj(
        "id" -> g.id.toString,
        "name" -> g.name,
        "department" -> g.department
      )
    }
  }

  def index = Action {
    Ok(views.html.index())
  }

  def some = Action {
    val group = Group(new ObjectId(),"3KSUA","KSU")
    Ok(Json.toJson(group))
  }

}