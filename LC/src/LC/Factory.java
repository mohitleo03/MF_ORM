package LC;

import java.util.ResourceBundle;

public class Factory {
    private static ResourceBundle rb = ResourceBundle.getBundle("config");
    private Factory()
    {}
    public static IWorker getObject()
    {
        Object object = null;
        String className = rb.getString("classname");
        try{
            object = Class.forName(className).getDeclaredConstructor().newInstance();
        }catch (Exception e){}
        return (IWorker)object;
    }
}
