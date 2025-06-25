package ajp;

class Vehicle {
	
void Mercedesbenz() {

System.out.println(" The car is in black color");
}
}

class BenzCar extends Vehicle {

void fastestcar() {

System.out.println("Benz car is the fastestcar to drive ");
}
}

public class BenzCarextends {

    public static void main(String[] args) {
        BenzCar bc = new BenzCar();
        bc.Mercedesbenz();
        bc.fastestcar();
    }
}