public class Main {
    public static void main(String[] args) {
        suma(10, 5, 20);

        Car miCar = new Car();

        miCar.sumDoors();
        miCar.sumDoors();
        System.out.println("The number of Doors is :"+ miCar.numbDoors);

    }

    public static void suma (int a, int b, int c){
        int solution;
        solution = a+b+c;
        System.out.println(solution);

    }



}
class Car {
    public int numbDoors=4;
    public void sumDoors (){
        this.numbDoors++;
    }
}

