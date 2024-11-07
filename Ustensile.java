package tp7;

public abstract class Ustensile {
 protected int annee;
 public Ustensile(int annee)
 {
	 this.annee=annee;
 }
 public double valeur()
 {
	  int age=2024-this.annee;
	  if(age<50)
	  {
		  return 0;
	  }
	  else
	  {
		  return age-50;
	  }
 }
}
