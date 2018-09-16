public class ReflectionHelper {
    public static Object createInstance(String className){
        try {
            Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //public static void setFieldValue(Object object, String fieldName, String value){

    //}


}
