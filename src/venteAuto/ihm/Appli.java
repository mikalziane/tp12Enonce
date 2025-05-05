// Appli.java
package venteAuto.ihm;

import venteAuto.*;


public class Appli {

  public static void essaiCircuit(Voiture v, int max) {
	  if (v.getVitesse() >0)
		  throw new IllegalArgumentException();
	 System.out.println("Essai circuit de "+v.getNom());
    while (v.getVitesse() < max) {
      v.accelerer();
      System.out.print(v.getVitesse()+ " ");
    }
    System.out.println();
    while (v.getVitesse() > 0) {
      v.freiner();
      System.out.print(v.getVitesse()+ " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
	int vmax = 130;
    Voiture[] tab = { 
        new Voiture("607"),
 //       new PasChere("2cv")
    };
    for (Voiture v : tab) {
    	essaiCircuit(v, vmax);
    }
  }
}
