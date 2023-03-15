package br.com.theschoollayout.theschool_project_interface;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.com.theschoollayout.theschool_project_interface.Pessoas.Interfaces.Pessoas.PessoasMain;

@Component
public class StartIntarface {

    public void loop()
    {

        int opcao = 0;
        Scanner input = new Scanner(System.in);

        do
        {

            System.out.println("-------------------Sistema Escola------------------");
            System.out.println("1 - Acessar pessoas");
            System.out.println("2 - Acessar Escolas");
            System.out.println("3 - Acessar Alunos");
            System.out.println("4 - Acessar Professores");
            System.out.println("0 - Sair");

            opcao = input.nextInt();
            switch(opcao)
            {
                case 1:

                    PessoasMain pessoasMain = new PessoasMain();
                    pessoasMain.mainPessoas();

                break;

                case 2:
                    
                break;

                case 3:
                    
                break;

                case 4:
                    
                break;

                case 0:
                    
                break;
            }

        }while(opcao != 0);

        input.close();
    }

}
