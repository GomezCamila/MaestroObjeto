package mestroobjetos;


public class Wizard extends Human{

private String ropa;

	public Wizard(String clase) {
		super(clase);
		this.clase="Wizard";
		this.ropa= "Traje es una tuniaca azul";
	}

	public Wizard() {
		// TODO Auto-generated constructor stub
	}

	public void ropa() {
		
		System.out.println("-------------------------------------------------------------------"); 
		System.out.println("Si eliges a Wizard");
		System.out.println("Eleccion de vestimenta: "+ ropa);
		System.out.println("-------------------------------------------------------------------"); 
	}


	
	
	public String getRopa() {
		return ropa;
	}

	public void setRopa(String ropa) {
		this.ropa = ropa;
	}

}
