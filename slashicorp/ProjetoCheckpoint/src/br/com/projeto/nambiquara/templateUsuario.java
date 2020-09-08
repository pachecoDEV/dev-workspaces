package br.com.projeto.nambiquara;

public class templateUsuario {
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String curso;
    private String certificacao;
    private String cpf;
    private String idioma;
    private String pretencaoSalarial;
    private String deficiencia;
    private String senha;
    private String cargo;
    private String departamento;
    private String nivel;
    
	public templateUsuario() {
		super();
	}

	public templateUsuario(String nome, String email, String endereco, String telefone, String curso,
			String certificacao, String cpf, String idioma, String pretencaoSalarial, String deficiencia,
			String senha, String cargo, String departamento, String nivel) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.curso = curso;
		this.certificacao = certificacao;
		this.cpf = cpf;
		this.idioma = idioma;
		this.pretencaoSalarial = pretencaoSalarial;
		this.deficiencia = deficiencia;
		this.senha = senha;
		this.cargo = cargo;
		this.departamento = departamento;
		this.nivel = nivel;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCertificacao() {
		return certificacao;
	}

	public void setCertificacao(String certificacao) {
		this.certificacao = certificacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getPretencaoSalarial() {
		return pretencaoSalarial;
	}

	public void setPretencaoSalarial(String pretencaoSalarial) {
		this.pretencaoSalarial = pretencaoSalarial;
	}

	public String getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
    