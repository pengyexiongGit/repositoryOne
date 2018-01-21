public class Main {

    public static void main(String[] args) {
        String name="张三";
        int age=25;
        String a=testOne(name, age);
        System.out.println(a);

    }

    public static  String  testOne(String name,int age){
        return "姓名："+name+"年龄："+age;
    }
}
