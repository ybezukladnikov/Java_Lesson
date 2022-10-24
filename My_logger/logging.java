package My_logger;

import java.io.IOException;
import java.util.logging.*;

/**
 * test
 */
public class logging {

    public static void logging_1(String path, String text) throws IOException {
        Logger logger = Logger.getLogger(logging.class.getName());


//        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler(path, true);
//        logger.addHandler(ch);
        logger.addHandler(fh);

//        SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
//        ch.setFormatter(sFormat);
        fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
//        logger.log(Level.WARNING, "Тест лог 1");
        logger.info(text);
    }
}