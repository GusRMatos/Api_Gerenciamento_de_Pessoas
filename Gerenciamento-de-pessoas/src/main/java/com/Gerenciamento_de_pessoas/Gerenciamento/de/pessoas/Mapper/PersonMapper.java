package com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Mapper;

import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Dto.Request.PersonDto;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

        PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

        @Mapping(target = "birddate", source = "birddate", dateFormat = "dd-MM-yyyy")
        Person toModel(PersonDto personDto);

        PersonDto toDto(Person person);
}
