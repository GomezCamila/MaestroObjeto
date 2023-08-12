package mestroobjetos;
import mestroobjetos.Human;

@SuppressWarnings("unused")
public class Samurai extends Human {
private String Trajee;

	
	
	public Samurai(String clase)
	{
		super(clase);
		
		
   this.Trajee="Traje de color rojo";
	
	}
	
	public void Trajeeleccion() {
		
		System.out.println("-------------------------------------------------------------------"); 
	    System.out.println("Si eliges Samurai ");
		System.out.println("Eleccion de ropa : "+ this.Trajee );
		System.out.println("-------------------------------------------------------------------"); 
	}
	public Samurai(Object object) {
		// TODO Auto-generated constructor stub
	
	}

	public String getTrajee() {
		return Trajee;
	}

	public void setTrajee(String trajee) {
		Trajee = trajee;
	}
 
}
