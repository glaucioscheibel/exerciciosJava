package com.github.glaucioscheibel.nosql.documento.odm;

import static com.github.glaucioscheibel.nosql.documento.odm.util.HibernateUtil.getSessionFactory;

import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Exercicio0105 {
    static void main() {
        try (Session session = getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Livro corvo = session.createQuery("from Livro l where l.titulo = :titulo", Livro.class)
                    .setParameter("titulo", "O Corvo")
                    .getSingleResult();
            corvo.setTitulo("O Corvo e outros contos extraordinários");
            tx.commit();
        }
    }
}
