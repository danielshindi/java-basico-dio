package edu.daniel.segundasemana;
public class MinhaClasse {
 
    public static void main (String [] args) {
        System.out.print( "Olá turma, sejam bem-vindos \n");

       /* int ano = 2021;
        
        ano = 2023;

        final String BR = "Brasil"; //variável que não pode ser alterada

        BR = "Brazil" // variáveis em maiúsculo pressupõe-se que são inalteráveis

        */


        /* Declarar  uma variável
         * 
         * Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
         */

         /* Declarar métodos
          * 
          TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
            Ex:
                int somar (int numeroUm, int numero2)
                String formatarCep (long cep)
          */
      
          String primeiroNome = "Daniel";
          String segundoNome = "Santana";

          String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

          System.out.println(nomeCompleto);

    }    

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
