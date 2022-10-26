import java.util.Random;
import java.util.Scanner;

public class Main {
    int z;
    final int x = 5;
    int y = 6;

    public static void main(String[] args) {
        Main myObj = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj2.y);

        Main myObj3 = new Main();
        myObj3.z = 160;
        System.out.println(myObj3.z);
        myStaticMethode();

        Main monObjet = new Main();
        monObjet.myMethode();

        Vehicule myCar = new Vehicule();
        myCar.typeVehicule();
        myCar.speed(200);
    }

    public void myMethode() {
        System.out.println("Hello CDA !");
    }

    static void myStaticMethode() {
        System.out.println("Methode Static");
    }

}
