package com.ufc.entity;

public class Palavra {

	private int Id_Palavra;
	private int Id_Cat;
	private String Nome;

	public Palavra() {

	}

	public int getId_Palavra() {
		return Id_Palavra;
	}

	public void setId_Palavra(int id_Palavra) {
		Id_Palavra = id_Palavra;
	}

	public int getId_Cat() {
		return Id_Cat;
	}

	public void setId_Cat(int id_Cat) {
		Id_Cat = id_Cat;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return Nome;
	}
}
