package br.gov.sp.fatec.topicosspingboot.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "coment_comentario")
public class Comentario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "coment_id")
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "coment_usr_id")
	private Usuario idUsrComentou;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "coment_f_id")
	private Filme idFilmeComentado;
	
	@Column(name = "coment_comentario")
	private String comentario;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getIdUsrComentou() {
		return idUsrComentou;
	}

	public void setIdUsrComentou(Usuario idUsrComentou) {
		this.idUsrComentou = idUsrComentou;
	}

	public Filme getIdFilmeComentado() {
		return idFilmeComentado;
	}

	public void setIdFilmeComentado(Filme idFilmeComentado) {
		this.idFilmeComentado = idFilmeComentado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
