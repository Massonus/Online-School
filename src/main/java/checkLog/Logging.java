package checkLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import utils.Controller;

import java.net.URISyntaxException;

public class Logging {
    private static final Logger logger = LogManager.getLogger(Controller.class);

    public static void Logging() {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        try {
            context.setConfigLocation(Logging.class.getResource("/log4j.xml").toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        logger.trace("Це повідомлення трасування");
        logger.debug("Це налагоджувальне повідомлення");
        logger.info("Це інформаційне повідомлення");
        logger.warn("Це попереджувальне повідомлення");
        logger.error("Це повідомлення про помилку");
        logger.fatal("Сталася помилка");

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Сталася помилка", e);
        }
    }
}
