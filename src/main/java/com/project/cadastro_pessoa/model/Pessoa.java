package com.project.cadastro_pessoa.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *
 * São necessários algumas anotations para indicar que
 * esta classe é uma entiadade e que comunicará com o banco de dados
 * e informar a tabela de referência
 *
 * **/

@Entity                                                             //Indicando que esta classe é uma entidade
@Table(name = "pessoa")                                             //Informando tabela de referência
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)                 //E a anotação @GeneratedValue incrementa automaticamente o id
    @Column(name = "id")                                            //A anotação @Column referencia a coluna da tabela ao atribuito da classe
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "DT_NASC")
    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
