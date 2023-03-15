package br.com.theschoollayout.theschool_project_interface.Pessoas.Interfaces.Pessoas;

import java.util.Scanner;

public class PessoasMain {
    
    public void mainPessoas()
    {

        int opcao = 0;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("------------------Sistema de pessoas------------------");
            System.out.println("1 - Cadastrar nova pessoa.");
            System.out.println("2 - Procurar pessoa.");
            System.out.println("3 - Pegar lista de pessoas.");
            System.out.println("4 - Editar pessoa.");
            System.out.println("5 - Deletar pessoa.");
            System.out.println("0 - Voltar.");

            opcao = input.nextInt();

            switch(opcao)
            {
                case 1:
                    PessoasCreate pessoa = new PessoasCreate();
                    pessoa.createPessoa();
                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;
            }

        }while(opcao!=0);

        input.close();

    }



}
