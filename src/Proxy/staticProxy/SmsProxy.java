package Proxy.staticProxy;
// 代理类也实现接口
public class SmsProxy implements SmsService{
   private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String messeage) {
        System.out.println("before method send()");
        smsService.send(messeage);
        System.out.println("after method send()");
        return null;
    }
}
