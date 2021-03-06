//蝙蝠类，继承哺乳动物类
public class Bat extends MammalAnimal{

    String name = "蝙蝠";
    String kind = "飞鼠";
    String limbsName = "翅膀";

    //重写run方法
    public void run() {
        System.out.println("物种为"+kind+"的"+name+"正在使用"+limbsName+"在飞行");
    }
}