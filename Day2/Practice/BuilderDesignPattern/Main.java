public class Main {

	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);
		
		engineer.construcHouse();
		
		House house = engineer.getHouse();
		
		System.out.println("Builder constructed: " + house);
	}

}
