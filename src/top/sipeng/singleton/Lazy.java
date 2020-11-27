package top.sipeng.singleton;

/**
 * @Author Si Peng
 * @Date 2020/11/27 9:09
 * @Version 1.0
 * 单例设计模式
 * 懒汉
 */
public class Lazy {
//    private static Lazy instance;

    /**
     * 构造函数私有化
     */
    private Lazy (){}

    /**
     * 单例对象的方法
     */
    public void process(){
        System.out.println("方法调用成功");
    }

    /**
     * 第一种方式
     * 对外暴露一个方法获取类的对象
     *
     * 线程不安全，多线程下存在安全问题
     * @return
     */
//    public static Lazy getInstance(){
//        if (instance == null){
//            instance = new Lazy();
//        }
//        return instance;
//    }

    /**
     * 第二种
     * 通过加锁 synchronized 保证单例
     *
     * 采用synchronized对方法加锁有很大的性能开销
     *
     * 解决办法：锁粒度不要那么大
     * @return
     */
//    public static synchronized Lazy getInstance(){
//        if (instance == null){
//            instance = new Lazy();
//        }
//        return instance;
//    }

    /**
     * 第三种实现方式
     *
     * DCL 双重检查锁定 （Double-Checked-Locking）,在多线程情况下保持高性能
     *
     * 这是否安全，instance = new Lazy();这并不是原子性操作
     * 1、分配空间给对象
     * 2、在空间创建对象
     * 3、将对象赋值给引用instance
     * 加入1-》3-》2顺序，会把值写进主内存，其他线程就会读取到instance最新的值，但是这个是不完全的对象
     * （指令重排）
     * @return
     */
//    public static Lazy getInstance(){
//        if (instance == null){
//            synchronized(Lazy.class){
//                if (instance == null){
//                    instance = new Lazy();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * volatile是Java提供的关键词，可以禁止指令重排
     * @return
     */
    private static volatile Lazy instance;
    public static Lazy getInstance(){
        // 第一重检查
        if (instance == null){
            // A、B ，锁定
            synchronized(Lazy.class){
                // 第二重检查
                if (instance == null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }
}
