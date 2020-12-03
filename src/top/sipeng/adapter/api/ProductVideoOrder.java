package top.sipeng.adapter;

/**
 * @Author Si Peng
 * @Date 2020/12/3 15:58
 * @Version 1.0
 */
public class ProductVideoOrder extends PayGateWayAdapter{

    @Override
    public void unifiedorder() {
        System.out.println("ProductVideoOrder   下单");
    }

    @Override
    public void refund() {
        System.out.println("ProductVideoOrder   退款");
    }
}
