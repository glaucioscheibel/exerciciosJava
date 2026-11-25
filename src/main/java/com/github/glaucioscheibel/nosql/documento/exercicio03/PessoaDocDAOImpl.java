package com.github.glaucioscheibel.nosql.documento.exercicio03;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;

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
        try {
            Bson doc = combine(
                    set("nome", pessoa.getNome()),
                    set("sobrenome", pessoa.getSobrenome()),
                    set("telefone", pessoa.getTelefone()),
                    set("idade", pessoa.getIdade()));
            collection.updateOne(eq("_id", pessoa.getId()), doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Pessoa read(int id) {
        Pessoa p = null;
        try {
            Document doc = collection.find(eq("_id", id)).first();
            if (doc != null) {
                p = gson.fromJson(doc.toJson(), Pessoa.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(int id) {
        collection.deleteOne(eq("_id", id));
    }
}
