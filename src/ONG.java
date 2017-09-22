import java.util.ArrayList;

public class ONG {
	
	private String nome;
	private String reponsável;
	private String estado;
	private ArrayList<Avalicao> avalicao;
	private ArrayList<Posto> posto;
	
	//metodos construtor 
	public ONG(String nome, String reponsável, String estado, ArrayList<Avalicao> avalicao, ArrayList<Posto> posto) {
		this.nome = nome;
		this.reponsável = reponsável;
		this.estado = estado;
		this.avalicao = avalicao;
		this.posto = posto;
	}
	
	
	
	

	//Metodo toString
	
		public String toString() {
			return "\n Nome: " + this.nome + "\n" +
			        "Responsável: " + this.reponsável + "\n" +
		         		"Estado: " + this.estado + "\n";
		}
	
		
	
	
   



// Metodos get e set 
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getReponsável() {
		return reponsável;
	}
	public void setReponsável(String reponsável) {
		this.reponsável = reponsável;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Avalicao> getAvalicao() {
		return avalicao;
	}

	public void setAvalicao(ArrayList<Avalicao> avalicao) {
		this.avalicao = avalicao;
	}
	public ArrayList<Posto> getPosto() {
		return posto;
	}
	public void setPosto(ArrayList<Posto> posto) {
		this.posto = posto;
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
