package sikidom;

public abstract class Sikidom {
	
	protected float ker,ter;
	
	public abstract float keruletSzamol();
	public abstract float teruletSzamol();
	
	public String adatKiir() {
		return "ter�lete: " + ter + ", " + "ker�lete: " + ker;
	}
	
}
