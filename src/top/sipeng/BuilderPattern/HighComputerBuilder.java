package top.sipeng.BuilderPattern;

/**
 * 具体的建造者，实现builder来创建不同的产品
 * @Author Si Peng
 * @Date 2020/12/2 16:00
 * @Version 1.0
 */
public class LowComputerBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("低配CPU");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("低配主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("低配 磁盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("低配电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("低配内存");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
