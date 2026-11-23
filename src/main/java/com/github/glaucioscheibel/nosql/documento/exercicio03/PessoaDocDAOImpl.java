package com.github.glaucioscheibel.nosql.documento.exercicio03;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public final class PessoaDocDAOImpl implements PessoaDAO {
    private final MongoCollection<Document> collection;
    private final Gson gson;

    public PessoaDocDAOImpl() {
        MongoClient mongoClient = MongoClients.create();
        collection = mongoClient.getDatabase("contatos").getCollection("pessoas");
        gson = new Gson();
    }

    public void create(Pessoa pessoa) {
        try {
            Document doc = Document.parse(gson.toJson(pessoa));
            collection.insertOne(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Pessoa pessoa) {
        create(pessoa);
    }

    public Pessoa read(int id) {
        Pessoa p = null;
        try {
            Document doc = collection.find(Filters.eq("id", id)).first();
            if (doc != null) {
                p = gson.fromJson(doc.toJson(), Pessoa.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(int id) {
        collection.deleteOne(Filters.eq("id", id));
    }
}
