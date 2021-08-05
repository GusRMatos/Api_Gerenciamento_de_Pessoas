package com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Controller;

import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Dto.Request.PersonDto;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Dto.Response.MessageResponseDto;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Exeption.PersonNotFoundExeption;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Model.Person;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Repository.PersonRepository;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDto createPerson(@RequestBody @Valid PersonDto personDto){
        return personService.savePerson(personDto);
    }

    @GetMapping
    public List<PersonDto> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDto getById(@PathVariable Long id) throws PersonNotFoundExeption {
        return personService.getById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDto updatePersonById(@PathVariable Long id,@RequestBody PersonDto personDto) throws PersonNotFoundExeption {
        return personService.updatePersonById(id, personDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePersonById(@PathVariable Long id) throws PersonNotFoundExeption {
        personService.Delete(id);
    }
}