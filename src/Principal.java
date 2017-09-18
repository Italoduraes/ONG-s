import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciar o BDSimulado
		BDSimulado bds= new BDSimulado();
		
		//Instanciar a lista de ONG e Posto
		
		ArrayList<ONG> ONG = bds.getONG();
		ArrayList<Posto> Posto= bds.getPosto();
		
		
	// 2) retorna informaçoes da ONG fornecido o seu nome
		ONG ong= bds.getInfoONG("hoob hood");
		
		//System.out.println(ong);
		
	// 3) retorne o numero de ONG'S que existem em Determinado Estado
		
		ArrayList<ONG> NumONGPorEstado = bds.getNumONGPorEstado("Amazonas");
		
		for (int i = 0; i < NumONGPorEstado.size(); i++) {
			//System.out.println(i + "\n");
		}
		
		
	// 4) retorne a lista de todos os postos que possuem uma capacidade de armaz. na quant. X
		
		ArrayList<Posto> PostosPorCapacidade = bds.getPostosPorCapacidade(1000);
		
		for (int i = 0; i < PostosPorCapacidade.size(); i++) {
			//System.out.println(PostosPorCapacidade.get(i).getCodigo() + "\n");
		}

		
	// 5) retorna o codigo dos postos que atendem vegetarianos
		
		ArrayList<Posto> PostosVegetarianos = bds.getPostosVegetarianos();
		
		for (int i = 0; i < PostosVegetarianos.size(); i++) {
			//System.out.println(PostosVegetarianos.get(i).isVegetariano() + "\n");
		}
		
	
		
		//juntar 
		
		bds.AddONGNoPostos("hoob hood", "João Pedro", 100000, true);
		bds.AddONGNoPostos("Fome jamais!", "Athur", 93200, false);
		bds.AddONGNoPostos("Eu me importo", "ìtalo Durães", 20000, false);
		bds.AddONGNoPostos("Amigos do bem", "Maria", 900, true);
//		bds.AddONGNoPostos("Sementes do Amanhã", "Amanda", 53252);
//		bds.AddONGNoPostos("Ajudando o proximo","Marcus",12344);
//		bds.AddONGNoPostos("Arca da Vida", "Valdemiro", 12345);
//		bds.AddONGNoPostos("Fome jamais!", "Athur",  8097);
//		bds.AddONGNoPostos("Eu me importo", "ìtalo Durães", 500);
//		bds.AddONGNoPostos("Amigos do bem", "Maria", 100987);
//		bds.AddONGNoPostos("Ajudando o proximo","Marcus",  500000);
//		bds.AddONGNoPostos("Sementes do Amanhã", "Amanda", 40000);
//		bds.AddONGNoPostos("Ajudando o proximo","Marcus", 40000);
//		bds.AddONGNoPostos("Fome jamais!", "Athur", 5325);
//		bds.AddONGNoPostos("Arca da Vida", "Valdemiro", 93200);
		
		
		
	// 1 questao 
		
		int consume= 500;
		int pessoas= 100;
		
		ArrayList<ONG> maiores = bds.getBuscaCapac(consume * pessoas);
		
		for (int i = 0; i < maiores.size(); i++) {
			//System.out.println(maiores.get(i).getNome());
		}
		
		
	// 2 questão 
		
		int consumoHomem = 500;
		int consumoMulher = 300;
		int consumoCrianca = 150;
		int mulheres= 4;
		int homens = 3;
		int criancas = 5;
		
           ArrayList<ONG> todos = bds.getBuscaCapac((consumoHomem * homens) + (mulheres * consumoMulher) + (criancas * consumoCrianca));
		
		for (int i = 0; i < todos.size(); i++) {
			//System.out.println(todos.get(i).getNome());
		}

		
		//  3 questao
		
		
	ArrayList<ONG> SeTemVegetarianos = bds.getSeTemVegetarianos("Maria");
		
		for (int i = 0; i < SeTemVegetarianos.size(); i++) {
		   //System.out.println(SeTemVegetarianos.get(i) );
		}
		
		
		
		
		
		
		
		
		
		
	}

}
