package br.com.theschoollayout.theschool_project_interface.Pessoas.Interfaces.Pessoas.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.theschoollayout.theschool_project_interface.Models.Pessoa;
import br.com.theschoollayout.theschool_project_interface.Pessoas.HttpClients.PessoaClient;

@RestController
public class PessoaController {

    @Autowired
    private PessoaClient pessoaClient;

    
    public Optional<Pessoa> createPessoa(Pessoa pessoa)
    {

        System.out.println(pessoaClient);

        try{

            pessoaClient.createPessoa(pessoa);

            return Optional.of(pessoa);

        }catch(Exception e)
        {
            System.out.println(e);
            return Optional.empty();
        }

    }

}
