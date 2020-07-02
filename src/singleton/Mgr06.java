package singleton;
/*
* lazy loading
* */
public class Mgr06 {
    private static Mgr06 INSTANCE = new Mgr06();

    private Mgr06() {
        System.out.println("1111111");
    }

    ;

    public static Mgr06 getInstance() {
        if (INSTANCE == null){
            synchronized (Mgr06.class){
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    }catch (Exception e){
                        e.getStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    private void print1() {
        System.out.println("22222222222");
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(() -> System.out.println(Mgr06.getInstance().hashCode())).start();
        }
    }
}
