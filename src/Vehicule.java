public class Vehicule {
    public void typeVehicule(){
        System.out.println("Ma voiture roule vite");
    }

    public void speed(int maxSpeed){
        System.out.println("Ma vitesse max est de " + maxSpeed);
    }

    public static void main(String[] args) {
        Vehicule myCar = new Vehicule();
        myCar.typeVehicule();
        myCar.speed(200);
    }

}
