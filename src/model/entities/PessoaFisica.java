package model.entities;

import java.util.Objects;

public class PessoaFisica extends Pessoa{
	
	private Integer idPessoaFisica;
	private Integer cpfPessoaFisica;
	private Integer rgPessoaFisica;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(Integer idPessoaFisica, Integer cpfPessoaFisica, Integer rgPessoaFisica) {
		super();
		this.idPessoaFisica = idPessoaFisica;
		this.cpfPessoaFisica = cpfPessoaFisica;
		this.rgPessoaFisica = rgPessoaFisica;
	}

	public Integer getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public void setIdPessoaFisica(Integer idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public Integer getCpfPessoaFisica() {
		return cpfPessoaFisica;
	}

	public void setCpfPessoaFisica(Integer cpfPessoaFisica) {
		this.cpfPessoaFisica = cpfPessoaFisica;
	}

	public Integer getRgPessoaFisica() {
		return rgPessoaFisica;
	}

	public void setRgPessoaFisica(Integer rgPessoaFisica) {
		this.rgPessoaFisica = rgPessoaFisica;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfPessoaFisica, idPessoaFisica, rgPessoaFisica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(cpfPessoaFisica, other.cpfPessoaFisica)
				&& Objects.equals(idPessoaFisica, other.idPessoaFisica)
				&& Objects.equals(rgPessoaFisica, other.rgPessoaFisica);
	}

	@Override
	public String toString() {
		return "PessoaFisica [idPessoaFisica=" + idPessoaFisica + ", cpfPessoaFisica=" + cpfPessoaFisica
				+ ", rgPessoaFisica=" + rgPessoaFisica + "]";
	}
	
	
}
