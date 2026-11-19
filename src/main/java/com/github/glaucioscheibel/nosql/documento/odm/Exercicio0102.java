package com.github.glaucioscheibel.nosql.documento.odm;

import static com.github.glaucioscheibel.nosql.documento.odm.util.HibernateUtil.getSessionFactory;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.github.glaucioscheibel.nosql.documento.odm.model.Endereco;
import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Exercicio0102 {
    static void main() {
        try (Session session = getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Livro corvo = new Livro("O Corvo");
            corvo.setAno(1845);
            Autor edgar = new Autor("Edgar Allan Poe");
            Endereco endereco1 = new Endereco();
            endereco1.setRua("7th Street");
            endereco1.setCidade("Philadelphia");
            endereco1.setTipo("residencial");
            edgar.addEndereco(endereco1);
            edgar.addLivro(corvo);
            session.persist(edgar);
            tx.commit();
        }
    }
}
