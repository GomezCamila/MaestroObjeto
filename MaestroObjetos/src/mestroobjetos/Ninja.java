package mestroobjetos;
import mestroobjetos.Human;
public class Ninja extends Human {

	
	private String traje;
	
	public Ninja(String clase) {
		
		super(clase);
	this.traje = "Traje de color negro";
	
	
	}
	public void Trajechooise() {
		
		System.out.println("-------------------------------------------------------------------"); 
		System.out.println("Si eligues Ninja");
		System.out.println("Elección de atuendo: "+ traje);
		System.out.println("-------------------------------------------------------------------"); 
	}
	


	

	//Getters y setters

	public String getTraje() {
		return traje;
	}
	public void setTraje(String traje) {
		this.traje = traje;
	}
	
}
