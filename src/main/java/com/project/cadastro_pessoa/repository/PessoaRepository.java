package com.project.cadastro_pessoa.repository;

import com.project.cadastro_pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Anotation indicando que interface é um repositório
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    //Ao extender do JpaRepository a interface herda seus métodos (save, find, delete, etc)
    //Informo o objeto e o tipo do id, por isso para cada tabela no bd deve existir um repository
}
