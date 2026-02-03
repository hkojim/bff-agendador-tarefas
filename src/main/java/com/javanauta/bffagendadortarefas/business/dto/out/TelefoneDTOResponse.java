package com.javanauta.bffagendadortarefas.business.dto.out;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTOResponse {
    private String Id;
    private String numero;
    private String ddd;
}
