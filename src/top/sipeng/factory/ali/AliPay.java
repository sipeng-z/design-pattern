package top.sipeng.factory.ali;

import top.sipeng.factory.PayFactory;

/**
 * @Author Si Peng
 * @Date 2020/11/27 14:29
 * @Version 1.0
 */
public class AliPayFactory implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("支付宝 统一下单接口");
    }
}
