package top.sipeng.decorator;

/**
 * @Author Si Peng
 * @Date 2020/12/8 14:00
 * @Version 1.0
 */
public class BigBike implements Bike {

    private String description="大号自行车";

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 200元是大号自行车的价格
     * @return
     */
    @Override
    public int getPrice() {
        return 200;
    }
}
