
public class SistemaAnimales {

	public static void main(String[] args) {
		Reptil tortuga = new Reptil();// Deme un hijo-> INSTANCIAR UN OBJETO tortuga
		Reptil cocodrilo = new Reptil();
		System.out.println("La tortuga tiene sangre " + tortuga.getTipoSangre());
		System.out.println("El cocodrilo tiene la piel con " + cocodrilo.getTipoPiel());

	}
}