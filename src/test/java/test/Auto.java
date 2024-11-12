package test;

public class Auto {
    String modelo, marca;
    int precio, registro;
    Motor motor;
    Asiento[] asientos;
    static String cantidadCreados;
    
    int cantidadAsientos() {
    	int cuenta = 0;
    	for (Asiento seat: this.asientos) {
    		if (seat instanceof Asiento) {
    			cuenta +=1;	
    		}
    	}
    	return cuenta;
    }
   
    String verificarIntegridad() { 
    	for (Asiento seat : this.asientos) { 
    		if (seat != null) { 
    			if (Asiento.registro != this.motor.registro || Asiento.registro != this.registro) { 
    				return "Las piezas no son originales"; } 
    			} 
    		} 
    	return "Las piezas son originales";
    	}
    }
    

