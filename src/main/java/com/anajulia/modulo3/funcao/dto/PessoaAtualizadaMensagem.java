package com.anajulia.modulo3.funcao.dto;

import java.time.LocalDate;

public record PessoaAtualizadaMensagem(
        String nome,
        LocalDate dt_nascimento
) {

}
