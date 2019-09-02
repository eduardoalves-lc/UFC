package com.ufc.controller;

import java.util.List;
import com.ufc.conexao.Connection_Factory;
import com.ufc.dao.PalavraDAO;
import com.ufc.entity.Palavra;

public class PalavraController {

	Connection_Factory Connection_Factory = new Connection_Factory();
	PalavraDAO PalavraDao = new PalavraDAO(Connection_Factory);

	public List<Palavra> ListaPalavras(int Id_Cat) {
		return PalavraDao.getPalavrasList(Id_Cat);
	}

	public String SortearPalavra(List<Palavra> Palavras) {
		return PalavraDao.SortearPalavra(Palavras);

	}
}
