package models

/**
 * User: Dimitr
 * Date: 11.12.13
 * Time: 11:53
 */
/**
 * @param plan Defines mark for some events like kilokvium, labs, etc.
 *             first Int is event id defines in Predefined.markableEvents
 */
case class Curriculum(subjectId:Int, plan: Map[Int, Int]) {

}
