package top.sipeng.decorator;

/**
 * @Description RSC 是防爆胎的缩写，角色ConcreteDecorator
 * @Author Si Peng
 * @Date 2020/12/8 14:06
 * @Version 1.0
 */
public class RSCBikeDecorator extends BikeDecorator {

    private String description = "增加一个防爆胎";

    private Bike bike;

    public RSCBikeDecorator(Bike bike){
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription()+","+description;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
