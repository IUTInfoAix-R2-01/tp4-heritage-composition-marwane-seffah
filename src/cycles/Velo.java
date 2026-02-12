package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	public static double getDEFAUT_BRAQUET () {
		return DEFAUT_BRAQUET;
	}
	
	public static void setDEFAUT_BRAQUET (double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo (double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo (double braquet) {
		this.braquet = braquet;
		this.diamRoue = 0;
	}
	
	public Velo () {
		this.braquet = DEFAUT_BRAQUET;
		this.diamRoue = 0;
	}
	
	public Random getGenAlea () {
		return genAlea;
	}
	
	public void setGenAlea (Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet () {
		return braquet;
	}
	
	public void setBraquet (double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue () {
		return diamRoue;
	}
	
	public void setDiamRoue (double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public String toString () {
		return "Velo [braquet="+ braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance (double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue + genAlea.nextDouble();
	}
	
	// c'est ça l'architecture du main
	public static void main(String[] args) {
		Velo v = new Velo();
		System.out.println(v);
		System.out.println("braquet du velo: " + v.getBraquet());
		System.out.println("diamètre de la roue du velo: " + v.getDiamRoue());
		System.out.println("genAlea: " + v.getGenAlea());
		System.out.println("puissance: " + v.getPuissance(8));
		v.setBraquet(2.0);
		v.setDiamRoue(120.0);
		System.out.println("braquet du velo: " + v.getBraquet());
		System.out.println("diamètre de la roue du velo: " + v.getDiamRoue());
		System.out.println("genAlea: " + v.getGenAlea());
		System.out.println("puissance: " + v.getPuissance(8));
	}
}