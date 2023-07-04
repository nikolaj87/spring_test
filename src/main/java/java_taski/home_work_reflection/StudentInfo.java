package java_taski.home_work_reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StudentInfo {
    String name();
    String surname();
    int age();
}
