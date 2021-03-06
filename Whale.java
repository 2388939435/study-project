public class Whale  extends MammalAnimal{
    String name = "虎鲸";
    String kind = "虎鲸科";
    String limbsName = "鳍";

    //重写run方法
    public void run() {
        System.out.println("物种为"+kind+"的"+name+"正在使用"+limbsName+"在游泳");
    }
}
