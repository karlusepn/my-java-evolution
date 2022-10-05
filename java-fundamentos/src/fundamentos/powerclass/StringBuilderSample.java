package fundamentos.powerclass;

public class StringBuilderSample {
    public static void main(String[] args){
        String nome = "Junior";
        double salario = 10562d;

        StringBuilder conteudo = new StringBuilder();

        conteudo.append(String.format("Meu nome é %s e meu salário é R$ %,.2f e minha matricula é %d"
                , nome, salario, 123));


        imprimir(conteudo.toString());
    }
    static void imprimir(String conteudo){
        System.out.println(conteudo);
    }
}
