package strategy;
/*
*   Comparator接口使用的就是策略模式
* */
public class Main {
    public static void main(String[] args){
        Dog[] arr = {new Dog(5), new Dog(1), new Dog(3)};

        // 排序前
        printDog(arr);

        // 策略模式处理
        Sorter<Dog> dogSorter = new Sorter<>();
        /*
        * Sorter类用到了策略模式，以后如果像增加新的策略，那么sorter不变，只要给sorter类传入新的比较器就可以了
        * */
        dogSorter.sort(arr, new DogComparator());

        // 排序后
        printDog(arr);
    }

    static void printDog(Dog[] arr){
        System.out.println("____________________________________");
        for (Dog dog: arr) {
            System.out.println(dog);
        }
    }
}
