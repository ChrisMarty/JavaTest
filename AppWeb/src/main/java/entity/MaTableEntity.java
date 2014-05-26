package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "MATABLE")
public class MaTableEntity implements Serializable, MaTable {

	public MaTableEntity() {
		super();
	}
	
	public MaTableEntity(int id, String code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}
	
	private static final long serialVersionUID = 6821299271576884308L;

	private int id;

	private String code;

	private String libelle;
	
	@Id
	@Column(name = "ID")
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "CODE")
	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "LIBELLE")
	@Override
	public String getLibelle() {
		return this.libelle;
	}

	@Override
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
