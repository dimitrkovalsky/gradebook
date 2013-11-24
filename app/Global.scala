import com.jungleo.preloaders.PreloadRunner
import java.util.logging.Logger
import play.api._
/**
 * User: dkovalskyi
 * Date: 18.09.13
 * Time: 18:29
 */
object Global extends GlobalSettings {
    private val logger: Logger = Logger.getLogger("YahooFinanceReader")

    override def onStart(app: Application) {
        logger.info("[Global] Application has started")

        PreloadRunner.load(active = false)
    }
}
