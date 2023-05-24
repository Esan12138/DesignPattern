package DesignPattern.decorator.log;

/**
 * @Description:
 * @Date:2023-04-21-9:39
 * @author:Esan
 */
public abstract class LoggerDecorator implements ILogger {
    protected ILogger logger;
    public LoggerDecorator(ILogger logger){
        this.logger = logger;
    }
}
