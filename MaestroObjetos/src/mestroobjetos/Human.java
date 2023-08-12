package mestroobjetos;

public class Human {
	//propiedades
    private int strength=-3; //fortaleza
	private int intelligence=-3; 
	private int stealth=-3;  //sigilo 
	private int health= 100;
	protected String clase="Humano";
	private String nombre="";
	private boolean vitalidad= true;
	


	public Human(String clase, int strength, int intelligence, int stealth, int health, String nombre, boolean vitalidad  ) {
		this.strength= strength;
		this.intelligence= intelligence;
		this.stealth= stealth;
		this.health=health;
		this.clase =clase;
		this.nombre=nombre;
		this.vitalidad= vitalidad;
		
	}
	
	






	
	//Metodo
	
	public Human(int strength, int intelligence, int stealth, int health, String clase, String nombre,
			boolean vitalidad) {
		super();
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
		this.clase = clase;
		this.nombre = nombre;
		this.vitalidad = vitalidad;
	}


	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Human(String nombre2) {
		this.nombre ="";
		// TODO Auto-generated constructor stub
	}
	



	public int displayEnergia() {
		System.out.println(health);
		return health;
	}
	

	public void attack(Human victima) {
		this.getHealth();
		   victima.setHealth(+this.strength);
	 }
 
	
	
	
	
	
	
	
	
//getters y setters
	public int getStrength() {
		return strength;
	}



	

	public void setStrength(int strength) {
		this.strength += strength;
	}



	public int getIntelligence() {
		return intelligence;
	}



	public void setIntelligence(int intelligence) {
		this.intelligence += intelligence;
	}



	public int getStealth() {
		return stealth;
	}



	public void setStealth(int stealth) {
		this.stealth += stealth;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health += health;
	}


    public String getClase() {
		return clase;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isVida() {
		return vitalidad;
	}


	public void setVida(boolean vitalidad) {
		this.vitalidad = vitalidad;
	}


}