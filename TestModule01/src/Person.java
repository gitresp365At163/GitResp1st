/**
 * @Auther: chizq
 * @Date: 2023/7/17 - 07 - 17 - 9:30
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
