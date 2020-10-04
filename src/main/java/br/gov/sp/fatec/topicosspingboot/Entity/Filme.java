package br.gov.sp.fatec.topicosspingboot.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "f_filme")
public class Filme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "f_id")
	private long id;
	
	@Column(name = "f_nome")
	private String nome;
	
	@Column(name = "f_genero")
	private String genero;
	
	@Column(name = "f_anolancamento")
	private String anoLancamento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idFilmeComentado")
	private Set<Comentario> comentariosRecebidos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Set<Comentario> getComentariosRecebidos() {
		return comentariosRecebidos;
	}

	public void setComentariosRecebidos(Set<Comentario> comentariosRecebidos) {
		this.comentariosRecebidos = comentariosRecebidos;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	
	
	
	
}
