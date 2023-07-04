package java_taski.home_work_reflection.taska1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface StringConstraint {

    int min() default 0;
    int max() default 100;

}
