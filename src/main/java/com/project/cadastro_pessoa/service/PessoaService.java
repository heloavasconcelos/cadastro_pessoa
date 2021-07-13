package com.project.cadastro_pessoa.service;

import com.project.cadastro_pessoa.mapper.PessoaMapper;
import com.project.cadastro_pessoa.model.Pessoa;
import com.project.cadastro_pessoa.model.dto.CadastroPessoaDTO;
import com.project.cadastro_pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private PessoaMapper pessoaMapper;


    @Transactional                                                  //Anotation que abre conexão com banco de dados durante a transação e encerra assim que ela for finalizada  //Ela controla os inserts e em caso de erro ela dá rollback em todos os procedimentos
    public CadastroPessoaDTO save(CadastroPessoaDTO cadastro) {     //O objeto do método save do service tem que ser o mesmo objeto do post do controller

        Pessoa pessoa = pessoaMapper.toEntity(cadastro);            //transformando dado DTO em Entidade
        pessoaRepository.save(pessoa);
        return pessoaMapper.toDto(cadastro);                        //transformando dado Entidade em DTO, para retornar id gerado automatico

    }
}
