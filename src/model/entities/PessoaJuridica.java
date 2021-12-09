package model.entities;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {
	
		private Integer idPessoaJuridica;
		private Integer cnpjPessoaJuridica;
		
		public PessoaJuridica() {
			
		}
		
		public PessoaJuridica(Integer idPessoaJuridica, Integer cnpjPessoaJuridica) {
			super();
			this.idPessoaJuridica = idPessoaJuridica;
			this.cnpjPessoaJuridica = cnpjPessoaJuridica;
		}

		public Integer getIdPessoaJuridica() {
			return idPessoaJuridica;
		}

		public void setIdPessoaJuridica(Integer idPessoaJuridica) {
			this.idPessoaJuridica = idPessoaJuridica;
		}

		public Integer getCnpjPessoaJuridica() {
			return cnpjPessoaJuridica;
		}

		public void setCnpjPessoaJuridica(Integer cnpjPessoaJuridica) {
			this.cnpjPessoaJuridica = cnpjPessoaJuridica;
		}

		@Override
		public int hashCode() {
			return Objects.hash(cnpjPessoaJuridica, idPessoaJuridica);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PessoaJuridica other = (PessoaJuridica) obj;
			return Objects.equals(cnpjPessoaJuridica, other.cnpjPessoaJuridica)
					&& Objects.equals(idPessoaJuridica, other.idPessoaJuridica);
		}

		@Override
		public String toString() {
			return "PessoaJuridica [idPessoaJuridica=" + idPessoaJuridica + ", cnpjPessoaJuridica=" + cnpjPessoaJuridica
					+ "]";
		}
		
		
		
}
