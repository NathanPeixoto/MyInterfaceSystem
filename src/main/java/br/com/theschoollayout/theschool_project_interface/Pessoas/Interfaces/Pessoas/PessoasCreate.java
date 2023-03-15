package br.com.theschoollayout.theschool_project_interface.Pessoas.Interfaces.Pessoas;

import java.util.Scanner;

import br.com.theschoollayout.theschool_project_interface.Models.Pessoa;
import br.com.theschoollayout.theschool_project_interface.Pessoas.Interfaces.Pessoas.Controller.PessoaController;

public class PessoasCreate {
    
    public void createPessoa()
    {
        String nome = "";
        int idade = 0;
        String cpf = "";
        String cargo = "";
        String trabalho = "";
        int validation = 0;

        Scanner input = new Scanner(System.in);

        do {

            if(validation == 2)
            {
                System.out.println("Reescreva os campos abaixo:\n");
            }else
            {
                System.out.println("Escreva nos campos indicados:\n");
            }
            
            System.out.println("- Digíte o nome da pessoa: ");
            nome = input.next();

            System.out.println("- Digíte a idade da pessoa: ");
            idade = input.nextInt();

            System.out.println("- Digíte o cpf da pessoa: ");
            cpf = input.next();

            System.out.println("- Digíte o cargo da pessoa: ");
            cargo = input.next();

            System.out.println("- Digíte o trabalho da pessoa: ");
            trabalho = input.next();

            System.out.println("- As informações informadas estão corretas ou deseja cancelar?\n 1. Sim\n2. Não\n3. Cancelar");
            validation = input.nextInt();

            switch(validation)
            {
                case 1:
                    System.out.println("Cadastrando pessoa...");
                    
                    Pessoa pessoa = new Pessoa();
                    PessoaController controller = new PessoaController();

                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    pessoa.setCpf(cpf);
                    pessoa.setCargo(cargo);
                    pessoa.setTrabalho(trabalho);

                    if(controller.createPessoa(pessoa).isPresent())
                    {
                        System.out.println("Pessoa cadastrada!");
                        System.out.println("Nome: " + nome);
                        System.out.println("Idade: " + idade);
                        System.out.println("CPF: " + cpf);
                        System.out.println("Cargo: " + cargo);
                        System.out.println("Trabalho: " + trabalho);

                        input.nextLine();
                        validation = 3;

                    }else
                    {
                        System.out.println("Erro ao cadastras a pessoa especificada, verifique se as informações estão corretas!");
                        input.nextLine();
                    }

                break;
                    
                case 0:
                    System.out.println("Encerrando aplicação...");
                break;
            }


        } while (validation == 1 ||validation == 3);

        System.out.println("\nAperte Enter para continuar.");
        input.nextLine();
        input.close();
    }

}
