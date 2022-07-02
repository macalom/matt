package niuke.单例;

/**
 * @创建人：Administrator
 * @备注：饿汉+懒汉（加锁）
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * private static Singleton instance;
     *     private Singleton (){}
     *     public static synchronized Singleton getInstance() {
     *     if (instance == null) {
     *         instance = new Singleton();
     *     }
     *     return instance;
     *     }
     */
}
