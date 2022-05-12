public class Main {
    public static void main(String[] args) {
        suma(10,10,10);

        Car miCar = new Car();
        miCar.addDoors();
        miCar.addDoors();
        System.out.println("The car have:"+ miCar.numbDoors+" Doors");
    }

    public static void suma (int a, int b, int c){
        int solution;
        solution = a+b+c;
        System.out.println(solution);
    }
}
class Car {
    public int numbDoors = 4;
    public void addDoors (){
        this.numbDoors++;
    }
}
