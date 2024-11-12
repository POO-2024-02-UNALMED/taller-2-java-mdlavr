package test;

public class Asiento {
    String color;
    int precio;
    public int registro;
    static String[] coloresPermitidos= {"rojo","verde","amarillo","negro","blanco"};
    
    void cambiarColor(String color) {
    	for(String nombreColor : coloresPermitidos) {
    		if (nombreColor.equals(color)) {
    			this.color=color;
    			break;
    		}
    	}
	}
    
}
