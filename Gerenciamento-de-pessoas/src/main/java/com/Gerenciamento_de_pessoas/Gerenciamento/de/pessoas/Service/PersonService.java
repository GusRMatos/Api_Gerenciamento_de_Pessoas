package com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Service;

import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Dto.Request.PersonDto;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Dto.Response.MessageResponseDto;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Exeption.PersonNotFoundExeption;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Mapper.PersonMapper;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Model.Person;
import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDto savePerson(PersonDto personDto){
        Person personToSave = personMapper.toModel(personDto);
        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDto.builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }


    public PersonDto getById(Long id) throws PersonNotFoundExeption {
        Optional<Person> optionalperson = personRepository.findById(id);
        if(optionalperson.isEmpty()){
            throw new PersonNotFoundExeption(id);
        }
        return personMapper.toDto(optionalperson.get());
    }

    public Person updatePerson(Person person){
        return personRepository.save(person);
    }


    public List<PersonDto> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }


    public void Delete(Long id) throws PersonNotFoundExeption{
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundExeption(id));
        personRepository.deleteById(id);
    }

    public MessageResponseDto updatePersonById(Long id, PersonDto personDto) throws PersonNotFoundExeption {
        personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundExeption(id));
        Person personToUpdate = personMapper.toModel(personDto);
        Person savedPerson = personRepository.save(personToUpdate);
        return MessageResponseDto.builder()
                .message("Updated person with ID " + savedPerson.getId())
                .build();
    }
}
