package DesignPattern.decorator.log;

import java.io.IOException;

/**
 * @Description:
 * @Date:2023-04-21-10:35
 * @author:Esan
 */
public class XMLLoggerDecorator extends LoggerDecorator{
    public XMLLoggerDecorator(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) throws IOException {
        logger.log("<message>"+msg+"</message>");
    }
}
