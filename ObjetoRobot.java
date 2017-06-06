import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObjetoRobot {
	public boolean pedirNuevamente=true;
	
	private String nombre="Soria";
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float Leer(){       
		String valorObtenido;      
		float valorConvertido=0;   
		try {
			InputStreamReader io = new InputStreamReader(System.in); 
			BufferedReader leer = new BufferedReader(io);
			valorObtenido=leer.readLine();
			valorConvertido=Float.parseFloat(valorObtenido);
			pedirNuevamente=false;
		} catch (NumberFormatException nf){
			System.out.println("Usted a Colocado un Valor Invalido");
			pedirNuevamente=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente=true;
 		} 
		return valorConvertido;
	}
	
	public String Leertexto(){       
		String valorObtenido="";      
		float valorConvertido=0;   
		try {
			InputStreamReader io = new InputStreamReader(System.in); 
			BufferedReader leer = new BufferedReader(io);
			valorObtenido=leer.readLine();
			
			pedirNuevamente=false;
		} catch (NumberFormatException nf){
			System.out.println("Usted a Colocado un Valor Invalido");
			pedirNuevamente=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente=true;
 		} 
		return valorObtenido;
	}
}

