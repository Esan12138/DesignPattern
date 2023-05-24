package DesignPattern.ChainOfResponsibility.exec1;

/**
 * @Description:使用责任链模式
 * @Date:2023-05-16-15:26
 * @author:Esan
 */
public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.createChain();
        chain.dowork(3);
    }
}
class Chain{
    Handler handlera  =  new ConcreteHandlerA();
    Handler handlerb  =  new ConcreteHandlerB();
    Handler handlerc  =  new ConcreteHandlerC();
    public void createChain() {
        handlera.setHandler(handlerb);
        handlerb.setHandler(handlerc);
    }

    public void dowork(int req){
        handlera.handleRequest(req);
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
        if(Request==1){
            System.out.println("组长处理了请假事件");
        }else{
            sucessor.handleRequest(Request);
        }
    }
}
class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int Request) {
        if(Request==2){
            System.out.println("项目经理处理了请假事件");
        }else{
            sucessor.handleRequest(Request);
        }
    }
}
class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int Request) {
        if(Request>2){
            System.out.println("总经理处理了请假事件");
        }else{
            sucessor.handleRequest(Request);
        }
    }
}