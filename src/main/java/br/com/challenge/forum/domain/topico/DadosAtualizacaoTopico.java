package br.com.challenge.forum.domain.topico;


import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String curso
) {
}