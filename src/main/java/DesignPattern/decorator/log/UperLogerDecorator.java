package DesignPattern.decorator.log;

import java.io.IOException;

/**
 * @Description:
 * @Date:2023-04-21-9:42
 * @author:Esan
 */
public class UperLogerDecorator extends LoggerDecorator {

    public UperLogerDecorator(ILogger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) throws IOException {
        System.out.println(msg.toUpperCase());
    }
}
