import java.lang.reflect.Array;
import java.util.ArrayList;




public class BDSimulado {
	
	private ArrayList<ONG> ONG;
	private ArrayList<Posto> Posto;

	public BDSimulado() {
		
		//Instanciar o atributo ONG
		
		this.ONG = new ArrayList<ONG>();
		
		//Instanciar objetos da classe ONG
		
		ONG O1= new ONG("hoob hood", "João Pedro" , "Rio de Janeiro");
		ONG O2= new ONG("Eu me importo", "ìtalo Durães", "Amazonas");
		ONG O3= new ONG("Amigos do bem", "Maria", "Amazonas");
		ONG O4= new ONG("Sementes do Amanhã", "Amanda", "São Paulo");
		ONG O5= new ONG("Ajudando o proximo","Marcus", "São Paulo");
		ONG O6= new ONG("Fome jamais!", "Athur", "Amazonas");
		ONG O7= new ONG("Arca da Vida", "Valdemiro", "Brasilia");
		
		//Colocar as ONG'S na lista 
		
		this.ONG.add(O1);
		this.ONG.add(O2);
		this.ONG.add(O3);
		this.ONG.add(O4);
		this.ONG.add(O5);
		this.ONG.add(O6);
		this.ONG.add(O7);
		
		//Instaciar objetos da class Posto
		
		this.Posto = new ArrayList<Posto>();
		
		Posto p1= new Posto(123455, 100000, true, false, false);
		Posto p2= new Posto(234565, 93200, false, false, true);
		Posto p3= new Posto(543267, 20000, false, true, true);
		Posto p4= new Posto(987650, 900, true, true, false);
		Posto p5= new Posto(567848, 53252, false, false, false);
		Posto p6= new Posto(123411, 12344, false, false, false);
		Posto p7= new Posto(121212, 12345, true, true, true);
		Posto p8= new Posto(431678, 8097, false, true, false);
		Posto p9= new Posto(643467, 500, false, false, true);
		Posto p10= new Posto(234244, 100987, true, false, false);
		Posto p11= new Posto(345687, 500000, false, true, true);
		Posto p12= new Posto(132134, 40000, false, false, true);
		
		//Colocar objetos da class Posto
		
		this.Posto.add(p1);
		this.Posto.add(p2);
		this.Posto.add(p3);
		this.Posto.add(p4);
		this.Posto.add(p5);
		this.Posto.add(p6);
		this.Posto.add(p7);
		this.Posto.add(p8);
		this.Posto.add(p9);
		this.Posto.add(p10);
		this.Posto.add(p11);
		this.Posto.add(p12);
		
	}
	
	public ArrayList<ONG> getONG() {
		return ONG;
	}


	public ArrayList<Posto> getPosto() {
		return Posto;
	}
	
	
	// 2) Metodo que retorna informaçoes da ONG fornecido o seu nome 
	
	
			public ONG getInfoONG(String nomeONG) {
				
				ONG resultado = null;
				
				for (int i = 0; i < this.ONG.size(); i++) {
					if(this.ONG.get(i).getNome().equals(nomeONG)) {
						resultado = this.ONG.get(i);
					}
				}
				
				
				return resultado;
			}
	
	
	// 3) Metodo que retorne o numero de ONG'S que existem em Determinado Estado
			
			public ArrayList<ONG> getNumONGPorEstado(String estado) {
				
				 ArrayList<ONG> resultado = new  ArrayList<ONG>();
				
				for (int i = 0; i < this.ONG.size(); i++) {
					if (this.ONG.get(i).getEstado().equals(estado)) {
						resultado.add(this.ONG.get(i));
					}
				}
				
				
				return resultado;
			}
			
			
	// 4) Crie metodo que retorne a lista de todos os postos que possuem uma capacidade de armaz. na quant. X
			
			public ArrayList<Posto> getPostosPorCapacidade(int x){
				
				ArrayList<Posto> resultado = new ArrayList<Posto>();
				
				for (int i = 0; i < this.Posto.size(); i++) {
					if (this.Posto.get(i).getCapacidade() >= x) {
						resultado.add(this.Posto.get(i));
					}
					
				}
					
				return resultado;
			}
	
	
	// 5) crie metodo que retorna o codigo dos postos que atendem vegetarianos
			
			public ArrayList<Posto> getPostosVegetarianos(){
				
				ArrayList<Posto> resultado= new ArrayList<Posto>();
				
				for (int i = 0; i < this.Posto.size(); i++) {
					if (this.Posto.get(i).isVegetariano() == true) {
						resultado.add(this.Posto.get(i));
					
					}
				}
				
				return resultado;
			}
			
	//		metodo que retorna a ONG de acordo com o responsavel 
			
			public ONG getPostoResponsavel(String Responsavel) {
				
				ONG resultado = null;
				
				for (int i = 0; i < this.ONG.size(); i++) {
					if(this.ONG.get(i).getReponsável().equals(Responsavel));{
						resultado = this.ONG.get(i);
					}
				}	
				return resultado;
			}
		

	// metodo que dá a ONG a um posto
			
			public void AddONGNoPostos(String nomeONG, String responsavel,  double capacidade, boolean veg ) {
				
			Avalicao unir = new Avalicao(getPostoResponsavel (responsavel), capacidade, veg);
				
			for (int i = 0; i < this.ONG.size(); i++) {
				if (this.ONG.get(i).getNome().equals(nomeONG)) {
					this.ONG.get(i).getAvalicao().add(unir);
				}
				
			}
			
			
			}
	
	//  1 e 2 questao 
	public ArrayList<ONG> getBuscaCapac(double capacidade){
		
		ArrayList<ONG> resultado = new ArrayList<ONG>();
		
		for (int i = 0; i < this.ONG.size(); i++) {
		    for (int j = 0; j < this.ONG.get(i).getAvalicao().size(); j++) {
				if (this.ONG.get(i).getAvalicao().get(j).getCapacidade() >= capacidade) {
					resultado.add(this.ONG.get(i));
				}
			}
		}
		
		return resultado;
	}
	
	
	public    ArrayList<ONG>  getSeTemVegetarianos(String nomeONG){
		
		ArrayList<ONG> resultado= new ArrayList<ONG>();
		
		for (int i = 0; i < this.ONG.size(); i++) {
			for (int j = 0; j < this.ONG.get(i).getAvalicao().size(); j++) {
				if (this.ONG.get(i).getAvalicao().get(j).isVegetariano() == true);
				resultado.add(this.ONG.get(i));
			}
			
			
		}
		
		return resultado;
	}
	
	
	
	
	
	
}

