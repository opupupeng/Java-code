import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class);
        // 输出日志信息
        logger.debug("this is debug message!");
        logger.info("this is info message!");
        logger.error("this is error message!");
        logger.warn("this is warning message!");
    }
}