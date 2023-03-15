package br.com.theschoollayout.theschool_project_interface.Pessoas.HttpClients;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.theschoollayout.theschool_project_interface.Models.Pessoa;

@FeignClient("http://localhost:8011/pessoas")
public interface PessoaClient {
    
    @RequestMapping(method = RequestMethod.POST,value = "/pessoas",consumes = "application/json")
    Optional<Pessoa> createPessoa(Pessoa pessoa);

    @RequestMapping(method = RequestMethod.GET,value = "/pessoas/{id}")
    Optional<Pessoa> getPessoa(@PathVariable String id);

    @RequestMapping(method = RequestMethod.GET,value = "/pessoas")
    List<Pessoa> getPessoas();

    @RequestMapping(method = RequestMethod.PUT,value = "/pessoas{id}",consumes = "application/json")
    Optional<Pessoa> editPessoa(@PathVariable String id, Pessoa pessoa);

    @RequestMapping(method = RequestMethod.DELETE,value = "/pessoas/{id}")
    Optional<Pessoa> deletePessoa(@PathVariable String id);

}
