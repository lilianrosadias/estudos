package br.com.liliandias.pessoasapi.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoTelefone {

    RESIDENCIAL("Residencial"),
    CELULAR("Celular"),
    COMERCIAL("Comercial");

    private TipoTelefone(String descricao){
        this.descricao = descricao;
    }
    private final String descricao;
}
