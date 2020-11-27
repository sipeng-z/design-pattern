package top.sipeng.factory;

/**
 * @Author Si Peng
 * @Date 2020/11/27 15:00
 * @Version 1.0
 */
public class SimplePayFactory {

    /**
     * 根据参数 返回对应的支付对象
     * @param payType
     * @return
     */
    public static Pay createPay(String payType){
        if (payType == null){
            return null;
        }else if (payType.equalsIgnoreCase("WECHAT_PAY")){
            return new WechatPay();
        }else if (payType.equalsIgnoreCase("ALI_PAY")){
            return new AliPay();
        }
        return null;
    }
}
