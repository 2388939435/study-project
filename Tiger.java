public class Tiger extends MammalAnimal{
    String name = "东北虎";
    String kind = "猫科";

    //重写run方法

    @Override
    public void run() {
        super.run();
        System.out.println("物种为"+kind+"的"+name+"正在使用"+limbsName+"在奔跑");
    }
}
