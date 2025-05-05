// Voiture.java
package venteAuto;

public class Voiture {
  private String nom;
  private int vitesse;

  public Voiture(String nom) {
    this.nom = nom;
    this.vitesse = 0;
  }



  public final String getNom() {
    return nom;
  }

  public final int getVitesse() {
    return vitesse;
  }

  public final void setVitesse(int v) {
    vitesse = v;
  }

  @Override
  public final String toString() {
    return nom;
  }

  // Les 3 m�thodes suivantes peuvent �tre sp�cialis�es

  private static final int VITESSE_MAX = 240;

  public int getVitesseMaximale() {
    return VITESSE_MAX;
  }

  private static final int PAS_ACCEL = 25;

  public void accelerer() {
    int v = getVitesse() + PAS_ACCEL;
    setVitesse(v < getVitesseMaximale() ? v : getVitesseMaximale());
  }

  private static final int PAS_FREIN = 20;

  public void freiner() {
    int v = getVitesse() - PAS_FREIN;
    setVitesse(v > 0 ? v : 0);
  }
}
