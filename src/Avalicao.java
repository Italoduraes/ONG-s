
public class Avalicao {

	
	private ONG ong;
	private double capacidade;
	private boolean vegetariano;
	private boolean semGluten;
	private boolean semLactose;
	
	
	
	//metodo construtor
	
	public Avalicao(ONG ong, double capacidade, boolean vegetariano) {
		super();
		this.ong = ong;
		this.capacidade = capacidade;
		this.vegetariano = vegetariano;
	}
	
	
	
	
	//metodo set e get
	
	public ONG getONG() {
		return ong;
	}
	public void setONG(ONG ong) {
		this.ong = ong;
	}
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public boolean isVegetariano() {
		return vegetariano;
	}
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	public boolean isSemGluten() {
		return semGluten;
	}
	public void setSemGluten(boolean semGluten) {
		this.semGluten = semGluten;
	}
	public boolean isSemLactose() {
		return semLactose;
	}
	public void setSemLactose(boolean semLactose) {
		this.semLactose = semLactose;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
