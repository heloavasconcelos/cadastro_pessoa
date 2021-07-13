package com.project.cadastro_pessoa.controller;

import com.project.cadastro_pessoa.model.dto.CadastroPessoaDTO;
import com.project.cadastro_pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController                                         //anotation serve para definir classe como controlador
@RequestMapping(value = "/pessoa")                      //anotation serve para informar o path da busca (url)
public class CadastroPessoaController {

    @Autowired                                          //esta anotação decidirá quando chamar o serviço pessoa
    private PessoaService pessoaService;                //definindo service relacionado a este controller

    /**Inserção de dados**/

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)      //anotation para informar o método para inserção de dados // os dados serão "consumidos" (receber) e "produzidos" em formato json
    public ResponseEntity<CadastroPessoaDTO> save(@Valid @RequestBody CadastroPessoaDTO cadastro){
        return ResponseEntity.ok(pessoaService.save(cadastro));
    }

    /**Alteração de dados**/
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)       //anotation para informar o método de alteração de dados
    public ResponseEntity<CadastroPessoaDTO> update(@Valid @RequestBody CadastroPessoaDTO cadastro){            //anotation @Valid validará dados do body do dto
        return ResponseEntity.ok(cadastro);
    }

    /**Listagem dos dados**/
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)                                                    //anotation para informar o método de buscar TODOS os dados
    public ResponseEntity<List<CadastroPessoaDTO>> findAll(){
        List<CadastroPessoaDTO> list = new ArrayList<>();
        CadastroPessoaDTO cad = new CadastroPessoaDTO();
        cad.setId(1L);
        cad.setCpf("03531212333");
        cad.setNome("Nome Teste");
        cad.setDataNascimento(LocalDate.now());
        cad.setEmail("teste@gmail.com");
        list.add(cad);
        return ResponseEntity.ok(list);
    }

    /**Listagem dos dados de acordo com uma ID**/
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CadastroPessoaDTO>> findById(@PathVariable Long id){                             //anotation @PathVariable responsável por buscar id da url

        List<CadastroPessoaDTO> list = new ArrayList<>();
        CadastroPessoaDTO cad = new CadastroPessoaDTO();
        cad.setId(1L);
        cad.setCpf("03531212333");
        cad.setNome("Nome Teste");
        cad.setDataNascimento(LocalDate.now());
        cad.setEmail("teste@gmail.com");
        list.add(cad);
        return ResponseEntity.ok(list);
    }

    /**Deleção de dados**/
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<CadastroPessoaDTO>> delete(@PathVariable Long id){
        return null;
    }
}
