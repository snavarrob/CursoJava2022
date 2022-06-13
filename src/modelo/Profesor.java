package modelo;

public class Profesor extends Persona {
	private String iosfa=" ";
	
	public Profesor() {
		
	}
	public Profesor(String apellido, String nombre, String iosfa) {
		super(apellido, nombre);
		this.iosfa=iosfa;	
		
	}
	
	public String getIosfa() {
		return iosfa;
	}
	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}	

}
