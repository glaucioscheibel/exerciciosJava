package com.github.glaucioscheibel.nosql.documento.exercicio03;

public interface PessoaDAO {
    void create(Pessoa pessoa);

    void update(Pessoa pessoa);

    Pessoa read(int id);

    void delete(int id);
}
