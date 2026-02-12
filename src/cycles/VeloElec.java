package cycles;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec (double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public VeloElec (double diamRoue, double facteurPuissance) {
		super(getDEFAUT_BRAQUET(), diamRoue); // donc en fait super c'est Velo dans ce contexte
		facteurPuissanceMoteur = facteurPuissance;
	}
	
	public VeloElec () {
		super();
		facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR () {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR (double DEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		VeloElec.DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_FACTEUR_PUISSANCE_MOTEUR; // puisque this fait référence à l'instance, VeloElec fait référence à la classe
	}
	
	public double getFacteurPuissanceMoteur () {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur (double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public String toString () {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance (double FrequenceCoupDePedale) {
		return super.getPuissance(FrequenceCoupDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec v = new VeloElec();
		System.out.println(v);
		System.out.println("braquet du velo: " + v.getBraquet());
		System.out.println("diamètre de la roue du velo: " + v.getDiamRoue());
		System.out.println("genAlea: " + v.getGenAlea());
		System.out.println("puissance moteur: " + v.getPuissance(8));
		System.out.println("facteur puissance moteur: " + v.getFacteurPuissanceMoteur());
		v.setBraquet(2.0);
		v.setDiamRoue(120.0);
		System.out.println();
		System.out.println("braquet du velo: " + v.getBraquet());
		System.out.println("diamètre de la roue du velo: " + v.getDiamRoue());
		System.out.println("genAlea: " + v.getGenAlea());
		System.out.println("puissance moteur: " + v.getPuissance(8));
		System.out.println("facteur puissance moteur: " + v.getFacteurPuissanceMoteur());
	}
}