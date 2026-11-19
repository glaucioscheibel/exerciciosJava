package com.github.glaucioscheibel.nosql.documento.odm;

import static com.github.glaucioscheibel.nosql.documento.odm.util.HibernateUtil.getSessionFactory;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import org.hibernate.Session;

public class Exercicio0103 {
    static void main() {
        try (Session session = getSessionFactory().openSession()) {
            Autor edgar = session.createQuery("from Autor a where a.nome = :nome", Autor.class)
                    .setParameter("nome", "Edgar Allan Poe")
                    .getSingleResult();
            System.out.println(edgar);
        }
    }
}
