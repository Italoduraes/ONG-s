import java.util.ArrayList;

public class ONG {
	
	private String nome;
	private String repons�vel;
	private String estado;
	private ArrayList<Avalicao> avalicao;
	private ArrayList<Posto> posto;
	
	//metodos construtor 
	public ONG(String nome, String repons�vel, String estado, ArrayList<Avalicao> avalicao, ArrayList<Posto> posto) {
		this.nome = nome;
		this.repons�vel = repons�vel;
		this.estado = estado;
		this.avalicao = avalicao;
		this.posto = posto;
	}
	
	
	
	

	//Metodo toString
	
		public String toString() {
			return "\n Nome: " + this.nome + "\n" +
			        "Respons�vel: " + this.repons�vel + "\n" +
		         		"Estado: " + this.estado + "\n";
		}
	
		
	
	
   



// Metodos get e set 
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRepons�vel() {
		return repons�vel;
	}
	public void setRepons�vel(String repons�vel) {
		this.repons�vel = repons�vel;
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
