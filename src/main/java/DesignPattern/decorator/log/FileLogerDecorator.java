package DesignPattern.decorator.log;

import java.io.IOException;

/**
 * @Description:
 * @Date:2023-04-21-9:49
 * @author:Esan
 */
public class FileLogerDecorator extends LoggerDecorator{
    public FileLogerDecorator(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) throws IOException {

    }
}
