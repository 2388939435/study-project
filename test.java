class Animal1 {
    public void  sayHello()//父类的方法
    {
        System.out.println("hello,everybody");
    }
}
class Dog extends Animal1//继承animal
{ }
public class test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sayHello();
    }
}