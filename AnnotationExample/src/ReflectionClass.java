import java.lang.reflect.Method;

public class ReflectionClass {

    public static void main(String[] args) throws NoSuchMethodException {

        AnnotationCheckClass annotationCheckClass=new AnnotationCheckClass();
        Method method=annotationCheckClass.getClass().getMethod("setName", String.class);
        annotationCheckClass.setName("Seyed");
        AddName addName=(AddName)method.getAnnotation(AddName.class);
        System.out.println("Default Name\t"+addName.value());
        annotationCheckClass.getName();



    }

    }



