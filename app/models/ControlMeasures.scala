package models

import com.novus.salat.annotations.raw.Key

/**
 * User: Dimitr
 * Date: 18.11.13
 * Time: 10:32
 */
case class ControlMeasures(@Key("_id") id: Int, title:String) {

}

object ControlMeasures{

}
