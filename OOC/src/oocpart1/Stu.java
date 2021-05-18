package oocpart1;

/**
 * @ClassName Stu
 * @Description TODO
 * @Author TTG
 * @Date 2021/5/10 9:12
 * @Version 1.0
 **/
public class Stu  extends Person{
    int ID;
    public Stu(){
        super(18);
    }
    public Stu(int ID,int age) {
        this.ID = ID;
        this.age = age;
    }

    public Stu(int age){
        super(age);
    }

    @Override
    public String toString() {
        return super.toString() + "xxx";
    }

    public static void main(String[] args) {
        Stu s = new Stu(10);
        System.out.println(s.toString());
    }
}
