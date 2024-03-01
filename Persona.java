public class Persona{
	private String nombre;
	private int matricula;
	public Persona(String nombre, int matricula){
	setNombre(nombre);
	setMatricula(matricula);
	}
	public void setNombre(String nombre){
	this.nombre = nombre.equals("")?"null" : nombre;
	}
	public void setMatricula(int matricula){
	this.matricula = matricula;
	}
	public String getNombre(){
	return nombre;
	}
	public int getMatricula(){
	return matricula;
	}
	public void mostrarDatos(){
	System.out.println("Nombre: " + getNombre() );
	System.out.println("Matricula: " + getMatricula() );
	}
/*	public static void main(String[] args){
	Persona p1 = new Persona("Adair Emanuel Uc Chim", 8424);
	p1.mostrarDatos();
	}
*/
}
