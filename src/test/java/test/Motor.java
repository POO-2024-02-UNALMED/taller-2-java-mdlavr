package test;

public class Motor {
    String tipo;
    int numeroCilindros;
    public static int registro;
    
    void cambiarRegistro(int numero) {
         registro=numero;
    }   
    
    void asignarTipo(String cambio) {
    	if (cambio.equals("electrico") || cambio.equals("gasolina")) {
    		this.tipo=cambio;
    	}
    }
}