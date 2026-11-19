package com.github.glaucioscheibel.nosql.documento.odm;

import static com.github.glaucioscheibel.nosql.documento.odm.util.HibernateUtil.getSessionFactory;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Exercicio0104 {
    static void main() {
        try (Session session = getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Livro gato = new Livro("O Gato Preto");
            gato.setAno(1843);
            session.persist(gato);
            Livro escaravelho = new Livro("O Escaravelho de Ouro");
            escaravelho.setAno(1862);
            session.persist(escaravelho);
            Autor edgar = session.createQuery("from Autor a where a.nome = :nome", Autor.class)
                    .setParameter("nome", "Edgar Allan Poe")
                    .getSingleResult();
            if (edgar != null) {
                edgar.addLivro(escaravelho);
                edgar.addLivro(gato);
                tx.commit();
            } else {
                System.err.println("Edgar Allan Poe não encontrado!");
                tx.setRollbackOnly();
            }
        }
    }
}
