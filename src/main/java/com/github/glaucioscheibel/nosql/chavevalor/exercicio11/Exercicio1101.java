package com.github.glaucioscheibel.nosql.chavevalor.exercicio11;

import java.util.Random;
import redis.clients.jedis.RedisClient;

public class Exercicio1101 {
    static void main() {
        Random random = new Random();
        RedisClient redis = RedisClient.create("redis://localhost:6379");
        boolean running = true;
        while (running) {
            int codigo = random.nextInt(999_999);
            System.out.printf("publicando %d no canal codigo:seguranca%n", codigo);
            redis.publish("codigo:seguranca", String.valueOf(codigo));
            try {
                Thread.sleep(20000);
            } catch (InterruptedException _) {
                running = false;
            }
        }
        redis.close();
    }
}
