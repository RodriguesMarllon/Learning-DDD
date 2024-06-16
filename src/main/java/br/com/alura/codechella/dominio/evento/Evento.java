package br.com.alura.codechella.dominio.evento;

import br.com.alura.codechella.Categoria;
import br.com.alura.codechella.Endereco;
import br.com.alura.codechella.dominio.ingresso.TipoIngresso;

public class Evento {

    private Categoria categoria;
    private String descricao;
    private localDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tipoIngressos;

}
