package tp7;

public class AssietteRonde extends Assiette {
  private double r;
  public AssietteRonde(int annee,double r)
  {
	  super(annee);
	  this.r=r;
  }
  public double surface()
  {
	  return 3.14*r*r;
  }
  
}
