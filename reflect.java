import java.lang.reflect.Method;

/**
 * Created by Tiny on 2019/1/8.
 */
public class reflect {

    /**
     * 获取class的三种方法
     * forName方法会抛出异常
     */
    public Class getClass0() throws ClassNotFoundException {
        Class clazz = Class.forName("Sailing");
        return clazz;
    }

    /**
     * 获取class的三种方法
     */
    public Class getClass1() {
        Class clazz = Sailing.class;
        return clazz;
    }

    /**
     * 获取class的三种方法
     */
    public Class getClass2() {
        Sailing sailing = new Sailing();
        Class clazz = sailing.getClass();
        return clazz;
    }

    /**
     * xss过滤（模拟）
     * 工具类应使用静态方法
     */
    public static String xss(String text) {
        text = text.replace("<", " &lt;");
        text = text.replace(">", "&gt;");
        return text;
    }

    /**
     * xss过滤（模拟）
     * 工具类应使用静态方法
     */
    public Object reflectXss(Object o) {
        Class clazz = o.getClass();
        //getDeclaredMethods s!
        Method[] mArray = clazz.getDeclaredMethods();
        for(Method m : mArray){
            Class returnClazz = m.getReturnType();
            if(returnClazz == String.class){
                String methodName = m.getName();
                if(methodName.startsWith("get")){
                    String field
                }
            }
        }
        return o;
    }

}