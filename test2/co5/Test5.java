package test2.co5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {

        //checked
        try{
//            Class clazz = Class.forName("test2.co5.Student.java");
            Class clazz = Student.class;
            Student s = new Student();

            System.out.println("this is ");
//            var m = clazz.getDeclaredMethods();
//            var m2 = clazz.getMethods();
//            var m3= clazz.getConstructors();
//            Arrays.stream(m3).toList().forEach(t-> System.out.println(t.toString()));
            var m = clazz.getMethods();
            for (Method t : m){
                if (t.isAnnotationPresent(Amghezi.class)) {
                    System.out.println("this is test ");
                    t.invoke(s);
                }

            }
            //
        }catch (Exception e){

            System.out.println("error happend");
        }

    }

}
