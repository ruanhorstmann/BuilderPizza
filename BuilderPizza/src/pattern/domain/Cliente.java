package pattern.domain;

public class Cliente {

	private int cpf;
	private String nome;
	private String telefone;

	public Cliente() {
	}
	
	public Cliente(int cpf, String nome, String telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		StringBuffer detalhes = new StringBuffer();
		detalhes.append("CPF: " + cpf);
		detalhes.append(" Cliente: " + nome);
		return detalhes.toString();
	}
}