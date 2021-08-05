package com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Repository;

import com.Gerenciamento_de_pessoas.Gerenciamento.de.pessoas.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
