package java_taski.home_work_reflection.taska1;

class MyClass {
    @StringConstraint(min = 2, max = 7)
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


public class Test {
    public static void main(String[] args) throws NoSuchFieldException {

        MyClass myClass = new MyClass("Hallo people");
        MyClass myClass2 = new MyClass("Hallo");
        MyClass myClass3 = new MyClass("H");

        System.out.println(    StringValidator.validate(myClass)     );
        System.out.println(    StringValidator.validate(myClass2)     );
        System.out.println(    StringValidator.validate(myClass3)     );
    }
}
