package com.github.glaucioscheibel.nosql.documento.odm.util;

import com.github.glaucioscheibel.nosql.documento.odm.model.Autor;
import com.github.glaucioscheibel.nosql.documento.odm.model.Endereco;
import com.github.glaucioscheibel.nosql.documento.odm.model.Livro;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Livro.class)
            .addAnnotatedClass(Autor.class)
            .addAnnotatedClass(Endereco.class)
            .buildSessionFactory();

    private HibernateUtil() {}

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
