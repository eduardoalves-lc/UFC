package com.ufc.entity;

public class Categoria {

	private int Id_cat;
	private String Nome;

	public Categoria(int id_cat, String nome) {
		super();
		Id_cat = id_cat;
		Nome = nome;
	}

	public int getId_cat() {
		return Id_cat;
	}

	public void setId_cat(int id_cat) {
		Id_cat = id_cat;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Categorias [Id_cat=" + Id_cat + ", Nome=" + Nome + "]";
	}

}
