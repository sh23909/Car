
public class CarDriver {
	public static void main(String [] args){
		Car myCar=new Car();
		Car hisCar=new Car("Black",400,3.5,"Honda");
		Car herCar=new Car("pink",300,2.5,"Volks");
		System.out.println(myCar);
		System.out.println(hisCar);
		System.out.println(herCar);
		myCar.setColor("Blue"); 
		myCar.sethp(650); 
		myCar.setengineSize(6.5);
		myCar.setmake("Ferrari");
		
		hisCar.setColor("Blue"); 
		hisCar.sethp(650); 
		hisCar.setengineSize(6.5);
		hisCar.setmake("Ferrari");
		
		herCar.setColor("Blue"); 
		herCar.sethp(650); 
		herCar.setengineSize(6.5);
		herCar.setmake("Ferrari");
		System.out.println(myCar.getcolor() + " " + myCar.gethp() + " " + myCar.getengineSize() + " " + myCar.getmake() + " "); 
		System.out.println(hisCar.getcolor() + " " + hisCar.gethp() + " " + hisCar.getengineSize() + " " + hisCar.getmake() + " "); 
		System.out.println(herCar.getcolor() + " " + herCar.gethp() + " " + herCar.getengineSize() + " " + herCar.getmake() + " "); 
	}

}
