package Logback_;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Test {
    //创建Logback日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");

    public static void main(String[] args) {
        try {
            LOGGER.debug("我的main方法开始执行");
            LOGGER.info("我开始打第二行日志 second line");
            int a = 10;
            int b = 0;
            LOGGER.trace("a = "+a);
            LOGGER.trace("b = "+b);
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能异常error了 + e");
        }

    }
}
