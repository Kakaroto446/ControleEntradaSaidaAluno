package Model;

public class ModelAluno {
	
	private Integer RM;
	private String nome;
	private String email;
	private String senha;
	private String curso;
	private String ano;
	private String resp;
	private String emailresp;
	private String foneresp;

	public Integer getRM() {
		return RM;
	}
	public void setRM(Integer RM) {
		this.RM = RM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getResp() {
		return resp;
	}
	public void setResp(String resp) {
		this.resp = resp;
	}
	public String getEmailResp() {
		return emailresp;
	}
	public void setEmailResp(String emailresp) {
		this.emailresp = emailresp;
	}
	public String getFoneResp() {
		return foneresp;
	}
	public void setFoneResp(String foneresp) {
		this.foneresp = foneresp;
	}
}