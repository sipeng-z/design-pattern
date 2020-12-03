package top.sipeng.adapter;

/**
 * @Author Si Peng
 * @Date 2020/12/3 16:01
 * @Version 1.0
 */
public class ProductVipOrder extends PayGateWayAdapter{

    @Override
    public void unifiedorder() {
        System.out.println("ProductVipOrder   下单");
    }

    @Override
    public void refund() {
        System.out.println("ProductVipOrder   退款");
    }

    @Override
    public void sendRedPack() {
        System.out.println("ProductVipOrder   发红包");
    }
}
