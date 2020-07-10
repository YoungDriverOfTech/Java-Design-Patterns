package singleton;

/*
* 饿汉式
* 类加载到内存后，就实例化一个单例，jvm保证线程安全
* 简单使用，推荐使用
* 缺点：不管用到与否，类加载时候就会完成实例化
* */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
        System.out.println("1111111");
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    private void print1() {
        System.out.println("22222222222");
    }

    public static void main(String[] args) {
        Mgr01 m1 = getInstance();
        Mgr01 m2 = getInstance();
        System.out.println(m1 == m2);
        m1.print1();
    }
}
