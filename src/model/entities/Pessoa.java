package model.entities;

import java.util.Objects;

public class Pessoa {
	
	private Integer idPessoa;
	private String nomePessoa;
	private String enderecoPessoa;
	private Integer cepPessoa;
	private String cidadePessoa;
	private String estadoPessoa;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer idPessoa, String nomePessoa, String enderecoPessoa, Integer cepPessoa, String cidadePessoa,
			String estadoPessoa) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.cepPessoa = cepPessoa;
		this.cidadePessoa = cidadePessoa;
		this.estadoPessoa = estadoPessoa;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}

	public Integer getCepPessoa() {
		return cepPessoa;
	}

	public void setCepPessoa(Integer cepPessoa) {
		this.cepPessoa = cepPessoa;
	}

	public String getCidadePessoa() {
		return cidadePessoa;
	}

	public void setCidadePessoa(String cidadePessoa) {
		this.cidadePessoa = cidadePessoa;
	}

	public String getEstadoPessoa() {
		return estadoPessoa;
	}

	public void setEstadoPessoa(String estadoPessoa) {
		this.estadoPessoa = estadoPessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cepPessoa, cidadePessoa, enderecoPessoa, estadoPessoa, idPessoa, nomePessoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cepPessoa, other.cepPessoa) && Objects.equals(cidadePessoa, other.cidadePessoa)
				&& Objects.equals(enderecoPessoa, other.enderecoPessoa)
				&& Objects.equals(estadoPessoa, other.estadoPessoa) && Objects.equals(idPessoa, other.idPessoa)
				&& Objects.equals(nomePessoa, other.nomePessoa);
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", enderecoPessoa=" + enderecoPessoa
				+ ", cepPessoa=" + cepPessoa + ", cidadePessoa=" + cidadePessoa + ", estadoPessoa=" + estadoPessoa
				+ "]";
	}
	

}
