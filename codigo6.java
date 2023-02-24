import java.util.Iterator;

public class codigo6 {

	public static void name() { // seagrego el static void
		int n = 20; //le quite los corchetes ya que estaban de más

	    for (int i = 0; i < 20; i++) { //faltaba un + en el contador
	    	int n1 = (int)(Math.random() * 381) + 20; // se cambio por n1 ya que me marcaba variable repetida
	    	System.out.println(n1 + " "); //
	    }
	    
	    System.out.print("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine() ); //faltaba cerrar parentesis

	    int multiplo = (opcion == 1)? 5: 7; //Estaba mal el operador ternario

	    foreach (char e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	       else {
	        System.in.print(e + " ");
	      }
	    }
	  
	}
		
	}
    
} //faltaba cerrar la llave del public class