package br.com.alura.codechella.dominio.evento;

import br.com.alura.codechella.infra.evento.Endereco;
import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public void inclueNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }

    public void aumentaNumeroDeIngressosPorTipo(){
        //Implementar aqui
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }
}
