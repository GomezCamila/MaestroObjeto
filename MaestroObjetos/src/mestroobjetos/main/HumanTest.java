package mestroobjetos.main;
import mestroobjetos.Human;

import mestroobjetos.Ninja;
import mestroobjetos.Wizard;
import mestroobjetos.Samurai;

@SuppressWarnings("unused")
public class HumanTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{    
	 Ninja ninja = new Ninja(null);
	 Wizard wizard = new Wizard(null);
	 Samurai samurai = new Samurai(null);{
	
    
		 
		 
 
   samurai.Trajeeleccion();
   
   
   
	 
		 
	ninja.Trajechooise();
	

	wizard.ropa();
	
	
	System.out.print("Vida inicial de Ninja: ");
	ninja.displayEnergia();
	
	
	
	System.out.print("Vida inicial de Wizard: ");
	wizard.displayEnergia();	
	
	System.out.print("Vida inicial de Samurai: ");
	samurai.displayEnergia();
	
	
	System.out.println("Wizard ataco a Samurai ");
	System.out.println("puntos perdidos de samurai: "+ samurai.getStrength());
	wizard.attack(samurai);
	
	
	System.out.println("==================================================");
	System.out.print("Vitalidad de Samurai:" );
	samurai.displayEnergia();
	
	
	System.out.println("==================================================");
	
	samurai.attack(ninja);
	System.out.println("Samurai ataco a Ninja");
	System.out.println("Puntos perdidos para Ninja :"+ ninja.getStrength());
	System.out.println("Puntos perdidos para Wizzard :"+ ninja.getStrength());
	
	System.out.println("==================================================");
	System.out.print("Vitalidad de Ninja:" );
	ninja.displayEnergia();
	
	
	System.out.println("==================================================");
	
	
	ninja.attack(wizard);
	System.out.println("Ninja ataco a wizard");
	System.out.println("Puntos perdidos para Wizzard :"+ wizard.getStrength());
	System.out.println("==================================================");
	System.out.print("Vitalidad de Wizard:" );
	wizard.displayEnergia();
	
	
	System.out.println("==================================================");
	


	

		System.out.println("Ninja ataco a Samurai");
		System.out.println("Puntos perdidos para Samurai :"+ samurai.getStrength());
		ninja.attack(samurai);
	System.out.println("==================================================");
	System.out.print("Vitalidad de Samurai:" );
	samurai.displayEnergia();
	
	
	System.out.println("==================================================");
	
	
	
		System.out.println("Samurai ataco a Wizard");
		System.out.println("Puntos perdidos para Samurai :"+ ninja.getStrength());
		
		samurai.attack(wizard);


	
	System.out.println("==================================================");
	System.out.print("Vitalidad de Wizard:" );
	wizard.displayEnergia();
	
	
	System.out.println("==================================================");
	

	System.out.println("Wizard ataco a Ninja");
	System.out.println("Puntos perdidos para Ninja :"+ ninja.getStrength());
	wizard.attack(ninja);
	
	System.out.println("==================================================");
	System.out.print("Vitalidad de Ninja:" );
	ninja.displayEnergia();
	
	
	System.out.println("==================================================");
	
    System.out.println("-> Finalizado <-");
	
	 
	
	}
	}

}
}
   






