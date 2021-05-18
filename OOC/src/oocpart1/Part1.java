package oocpart1;

/**
 * @ClassName Part1
 * @Description TODO
 * @Author TTG
 * @Date 2021/5/9 13:12
 * @Version 1.0
 **/
public class Part1 {
    public static void main(String[] args) {
        Person p = new Person(15);
        System.out.println(p);
    }
}
class Person{
    protected int age;
    String sex;
    Person(){
        this.age = 18;this.sex = "M";
    }
    Person(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
