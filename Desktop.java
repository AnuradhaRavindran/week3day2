package week3.day2;

public  class Desktop implements Hardware,Software {
	public void desktopModel() {
		System.out.println("This is desktopmodel method from desktop");

	}

	public void softwareResources() {
		
		System.out.println("This is interface from Hardware method"); 
	}

	public void hardwareresources() {

		System.out.println("This is interface from Software method"); 
		
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopModel();
		obj.softwareResources();
		obj.hardwareresources();
	}
}
