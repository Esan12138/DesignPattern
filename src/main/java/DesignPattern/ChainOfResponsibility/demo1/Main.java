package DesignPattern.ChainOfResponsibility.demo1;

/**
 * @Description:责任链模式
 * @Date:2023-05-16-15:06
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
    Handler handlera  =  new ConcreteHandlerA();
    Handler handlerb  =  new ConcreteHandlerB();
    Handler handlerc  =  new ConcreteHandlerC();
    handlera.setHandler(handlerb);
    handlerb.setHandler(handlerc);

    handlera.handleRequest(33);
    }
}

abstract class Handler {
    protected Handler sucessor;

    public void setHandler(Handler sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void handleRequest(int Request);
}

class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(int Request) {
        if(Request<0){
            System.out.println("ConcreteHandlerA处理了事情");
        }else{
            sucessor.handleRequest(Request);
        }
    }
}
class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int Request) {
        if(Request>=0 &&Request<=10){
            System.out.println("ConcreteHandlerB处理了事情");
        }else{
            sucessor.handleRequest(Request);
        }
    }
}
class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int Request) {
        if(Request>10){
            System.out.println("ConcreteHandlerC处理了事情");
        }else{
            sucessor.handleRequest(Request);
        }
    }
}