package com.github.glaucioscheibel.nosql.chavevalor.exercicio10;

import com.google.gson.Gson;
import redis.clients.jedis.RedisClient;

public class PessoaKVDAOImpl implements PessoaDAO {
    private final RedisClient redis;
    private final Gson gson;

    public PessoaKVDAOImpl() {
        redis = RedisClient.create("redis://localhost:6379");
        gson = new Gson();
    }

    public void create(Pessoa pessoa) {
        try {
            redis.jsonSet("contatos4:" + pessoa.getId(), gson.toJson(pessoa));
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
            Object o = redis.jsonGet("contatos4:" + id);
            p = gson.fromJson(o.toString(), Pessoa.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void delete(int id) {
        redis.del("contatos2:" + id);
    }
}
