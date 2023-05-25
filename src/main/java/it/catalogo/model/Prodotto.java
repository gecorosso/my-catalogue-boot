package it.catalogo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prodotto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descrizione")
	private String descrizione;
	
	@Column(name="prezzo")
	private int prezzo;
	
	
	public Integer getId() {
		return id;
	}
	
	@Column(name="")
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="")
	public String getNome() {
		return nome;
	}
	
	@Column(name="")
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="")
	public String getDescrizione() {
		return descrizione;
	}
	
	@Column(name="")
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	@Column(name="")
	public int getPrezzo() {
		return prezzo;
	}
	
	@Column(name="")
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


}
