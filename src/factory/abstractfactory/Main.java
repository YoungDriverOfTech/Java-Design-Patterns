package factory.abstractfactory;

public class Main {
    public static void main(String[] args){
        /*
        * 此抽象工厂模式，只需要将下面的一行 改成 MagicFactory 就可以实现，成套的产品族转换
        * */
        AbstractFactory f = new ModernFactory();

        Food food = f.createFood();
        Vehicle vehicle = f.createVehicle();
        Weapon weapon = f.createWeapon();

        food.printName();
        vehicle.go();
        weapon.shoot();
    }
}
