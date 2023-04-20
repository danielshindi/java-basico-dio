public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
       //tipos primitivos
       //estudar a classe String
       String meuNome = "Daniel Santana";
       
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo - precisa terminar com L
		float pi = 3.14F; //Para float, precisa ter a letra F (ou f) no final
		double salario = 1275.33;


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting - converte numeroNormal para short

        final double VALOR_DE_PI = 3.14; // constante -     em caixa alta por convenção 
    }
}
