package com.project.cadastro_pessoa.mapper;

import com.project.cadastro_pessoa.model.Pessoa;
import com.project.cadastro_pessoa.model.dto.CadastroPessoaDTO;
import org.springframework.stereotype.Component;

@Component                                                              //anotação (genérica) para gerenciar as instâncias
public class PessoaMapper {

    public Pessoa toEntity(CadastroPessoaDTO cadastro) {                //entra objeto do tipo DTO e sai do tipo Entidade - DE-PARA entre classe entidade pessoa e classe dto
        Pessoa pessoa = new Pessoa();
        pessoa.setId(cadastro.getId());
        pessoa.setCpf(cadastro.getCpf());
        pessoa.setNome(cadastro.getNome());
        pessoa.setEmail(cadastro.getEmail());
        pessoa.setDataNascimento(cadastro.getDataNascimento());
        return pessoa;
    }

    public CadastroPessoaDTO toDto(CadastroPessoaDTO cadastro) {        //transformando dado Entidade em DTO, para retornar id gerado automatico
        Pessoa pessoa = new Pessoa();
        cadastro.setId(pessoa.getId());
        cadastro.setCpf(pessoa.getCpf());
        cadastro.setNome(pessoa.getNome());
        cadastro.setEmail(pessoa.getEmail());
        cadastro.setDataNascimento(pessoa.getDataNascimento());
        return cadastro;
    }
}
