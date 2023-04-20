public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAMGE" + "JAVA";
       
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        int numero = 5;
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);
        numero = - numero;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        System.out.println(numero++); //Ele vai imprimir numero, e só depois incrementar
        System.out.println(numero);

        System.out.println(++numero); //Nesse caso, ele vai incrementar antes de imprimir


        boolean variavel = true;
        variavel = !variavel;

        System.out.println(variavel);


        // Operador ternário ( ?: )
        // <Expressão condicional> ? <caso condição seja true> : <caso condição seja false>

        int a = 6;
        int b = 5;
        /* String resultado = "";

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
        */

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        int continua = a==b ? 1 : 0 ;
        System.out.println(continua);


        //Operadores relacionais
        //  retorna um valor booleano

        String nomeUm = "Daniel";
        String nomeDois = "Daniel";

        System.out.println(nomeUm==nomeDois);

        String nome1 = "Daniel";
        String nome2 = new String("Daniel");
        System.out.println(nome1==nome2);
        System.out.println(nome1.equals(nome2));  //método equals: compara conteúdos de dois objetos


        //Operadores lógicos
        // && e
        // || ou
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
        }


    }
}
