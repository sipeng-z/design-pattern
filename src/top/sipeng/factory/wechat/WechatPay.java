package top.sipeng.factory.wechat;

import top.sipeng.factory.PayFactory;

/**
 * @Author Si Peng
 * @Date 2020/11/27 14:29
 * @Version 1.0
 */
public class WechatPayFactory implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单接口");
    }
}
