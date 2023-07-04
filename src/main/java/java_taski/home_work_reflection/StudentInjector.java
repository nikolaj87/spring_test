package java_taski.home_work_reflection;

import java.lang.reflect.Field;

public class StudentInjector {
    public static void inject(Student student, Object target) throws IllegalAccessException {
        Class<?> targetClass = target.getClass();
        Field[] fields = targetClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == Student.class && field.isAnnotationPresent(StudentInfo.class)) {
                StudentInfo studentInfo = field.getAnnotation(StudentInfo.class);
                field.setAccessible(true);
                field.set(target, createStudent(studentInfo));
            }
        }
    }

    private static Student createStudent(StudentInfo studentInfo) {
        String name = studentInfo.name();
        String surname = studentInfo.surname();
        int age = studentInfo.age();
        return new Student(name, surname, age);
    }
}

