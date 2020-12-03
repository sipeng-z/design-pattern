package top.sipeng.adapter;

/**
 * @Author Si Peng
 * @Date 2020/12/3 15:02
 * @Version 1.0
 */
public interface PayGateway {

    /**
     * 下单
     */
    void unifiedorder();

    /**
     * 退款
     */
    void refund();

    /**
     * 查询
     */
    void query();

    /**
     * 发红包
     */
    void sendRedPack();
}
