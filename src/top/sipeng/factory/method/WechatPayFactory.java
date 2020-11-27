package top.sipeng.factory.method;

import top.sipeng.factory.Pay;

/**
 * @Author Si Peng
 * @Date 2020/11/27 15:25
 * @Version 1.0
 */
public class WechatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new top.sipeng.factory.WechatPay();
    }
}
