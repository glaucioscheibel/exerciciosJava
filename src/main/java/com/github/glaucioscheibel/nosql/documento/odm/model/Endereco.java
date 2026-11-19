package com.github.glaucioscheibel.nosql.documento.odm.model;

import jakarta.persistence.Embeddable;
import org.hibernate.annotations.Struct;

@Embeddable
@Struct(name = "endereco")
public class Endereco {
    private String rua;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String tipo;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Endereco [rua=" + rua + ", bairro=" + bairro + ", complemento=" + complemento + ", cep=" + cep
                + ", cidade=" + cidade + ", tipo=" + tipo + "]";
    }
}
