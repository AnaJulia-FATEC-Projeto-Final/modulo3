package com.anajulia.modulo3.funcao;

import com.anajulia.modulo3.funcao.dto.PessoaAtualizadaMensagem;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;

@Component
public class PessoaAtualizadaFuncao {
    @Bean
    public Consumer<PessoaAtualizadaMensagem> lambdaConsumer() {
        return consumer -> {
            System.out.println("A mensagem chegou: " + consumer.toString());
        };
    }
}
