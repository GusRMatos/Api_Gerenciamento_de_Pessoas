package com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private Long id;

    @NotEmpty
    @Size(min = 2, max =50)
    private String firstname;

    @NotEmpty
    @Size(min = 2, max =50)
    private String lastname;

    @NotEmpty
    @CPF
    private String cpf;

    private String birddate;

    @NotEmpty
    @Valid
    private List<PhoneDto> phones;
}
