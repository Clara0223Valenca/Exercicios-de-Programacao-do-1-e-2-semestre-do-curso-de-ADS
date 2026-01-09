public class main {
    public static void main(String[] args) {

        //instancia o objeto:
        Pessoa pessoa1 = new Pessoa("João", 2000, "111.333.555-77");

        //exemplo caso tivesse utilizando set:
        //pessoa1.setNome("João");
        //pessoa1.setAno(200);
        

        System.out.println( "TESTE 1: \n");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getAno());
        System.out.println(pessoa1.getCpf());
        System.out.println(pessoa1.calculaIdade(2026));

        Pessoa pessoa2 = new Pessoa("Maria Julia", 2007, "333.666.999-22");

        System.out.println("\n TESTE 2 \n");

        System.out.println("Seja bem vinda ao sistema " + pessoa2.getNome() + "!\nConfira seus dados: \nIdade atual: " + pessoa2.calculaIdade(2026) + " anos \nCPF: " + pessoa2.getCpf());
    }
}
