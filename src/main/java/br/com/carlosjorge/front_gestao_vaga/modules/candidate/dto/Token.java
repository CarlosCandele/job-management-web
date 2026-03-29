package br.com.carlosjorge.front_gestao_vaga.modules.candidate.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Token {

    private String access_token;
    private Long expires_in;
    private List<String> roles;

}

