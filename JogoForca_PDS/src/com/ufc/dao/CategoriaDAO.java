package com.ufc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ufc.conexao.Connection_Factory;
import com.ufc.entity.Palavra;

public class CategoriaDAO {

	private Connection Connection;
	private Connection_Factory Connection_Factory;

	public CategoriaDAO(Connection_Factory Connection_Factory) {
		this.Connection_Factory = Connection_Factory;
	}

	public List<Palavra> getCatPalavrasList(int Id_Cat) {
		String sql = "SELECT * FROM palavras P where P.Id_Cat = ?;";
		List<Palavra> palavraList = new ArrayList<Palavra>();

		try {
			this.Connection = Connection_Factory.getConnection();
			PreparedStatement stmt = Connection.prepareStatement(sql);
			stmt.setInt(1, Id_Cat);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Palavra palavra = new Palavra();
				palavra.setNome(rs.getString("Nome"));

				palavraList.add(palavra);
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("");
		} finally {
			try {
				this.Connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return palavraList;
	}
}
