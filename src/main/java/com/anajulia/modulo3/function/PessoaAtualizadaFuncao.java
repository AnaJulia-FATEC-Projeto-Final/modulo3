package com.anajulia.modulo3.function;

import com.anajulia.modulo3.function.dto.PessoaAtualizadaMensagem;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PessoaAtualizadaFuncao {
    @Bean
    public Consumer<PessoaAtualizadaMensagem> clientRegisteredConsumer() {
        return consumer -> {
            System.out.println("A mensagem chegou: " + consumer.toString());
        };
    }
}
