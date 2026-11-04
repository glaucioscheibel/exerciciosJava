package com.github.glaucioscheibel.nosql.chavevalor;

import java.util.Set;
import redis.clients.jedis.RedisClient;

public class Exercicio02 {
    static void main() {
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        for (int i = 1; i <= 10; i++) {
            redis.set("chave" + i, "valor" + i);
        }
        Set<String> chaves = redis.keys("chave*");
        for (String chave : chaves) {
            System.out.printf("%s = %s%n", chave, redis.get(chave));
        }
        redis.close();
    }
}
