package java_taski.home_work_reflection;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;
    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;

    public School() {
        try {
            StudentInjector.inject(new Student(), this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // Другие методы и поля класса School
}

