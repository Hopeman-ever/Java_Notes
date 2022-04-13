package Proxy.staticProxy;
//目标类实现接口
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String messeage) {
        System.out.println("send message:"+messeage);
        return messeage;
    }
}
