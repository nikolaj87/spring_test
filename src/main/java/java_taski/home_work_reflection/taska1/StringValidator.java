package java_taski.home_work_reflection.taska1;

import java.lang.reflect.Field;

public class StringValidator {

    public static boolean validate(MyClass myClass) throws NoSuchFieldException {
        Class<?> clazz = myClass.getClass();
        Field field = clazz.getDeclaredField("value");
        StringConstraint annotation = field.getAnnotation(StringConstraint.class);

        return myClass.getValue().length() > annotation.min() &&
                myClass.getValue().length() < annotation.max();
    }
}
