package dao.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BDInicializador {
	public static void inicializar() {
		try (Connection c = DriverManager.getConnection(BD.URL_CONEXAO); Statement st = c.createStatement()) {
			st.execute("""
					    CREATE TABLE IF NOT EXISTS associado (
					        id INTEGER PRIMARY KEY AUTOINCREMENT,
					        nome TEXT NOT NULL,
					        foraneo BOOLEAN NOT NULL
					    );
					""");

			st.execute("""
					    CREATE TABLE IF NOT EXISTS anoLeoistico (
					        id INTEGER PRIMARY KEY AUTOINCREMENT,
					        nome TEXT NOT NULL,
					        finalizado BOOLEAN NOT NULL
					    );
					""");

			st.execute("""
					    CREATE TABLE IF NOT EXISTS trimestre (
					        id INTEGER PRIMARY KEY AUTOINCREMENT,
					        nome TEXT NOT NULL,
					        finalizado BOOLEAN NOT NULL,
					        idAnoLeoistico INTEGER NOT NULL,
					        FOREIGN KEY (idAnoLeoistico) REFERENCES anoLeoistico(id)
					    );
					""");

			st.execute("""
					    CREATE TABLE IF NOT EXISTS reuniao (
					        id INTEGER PRIMARY KEY AUTOINCREMENT,
					        data TEXT NOT NULL,
					        idTrimestre INTEGER NOT NULL,
					        FOREIGN KEY (idTrimestre) REFERENCES trimestre(id)
					    );
					""");

			st.execute("""
					    CREATE TABLE IF NOT EXISTS presenca (
					        id INTEGER PRIMARY KEY AUTOINCREMENT,
					        idAssociado INTEGER NOT NULL,
					        idReuniao INTEGER NOT NULL,
					        FOREIGN KEY (idAssociado) REFERENCES associado(id),
					        FOREIGN KEY (idReuniao) REFERENCES reuniao(id),
					        UNIQUE(idAssociado, idReuniao)
					    );
					""");

		} catch (Exception e) {
			throw new RuntimeException("Erro ao criar o schema do banco", e);
		}
	}
}
