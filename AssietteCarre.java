package tp7;

public class AssietteCarre extends Assiette {
  private double cote;
  public AssietteCarre(int annee ,double cote)
  {
	  super(annee);
	  this.cote=cote;
  }
  
  public double surface()
  {
	  return cote*cote;
  }
 public double valeur()
 {
	 return 5*super.valeur();
 }
}
