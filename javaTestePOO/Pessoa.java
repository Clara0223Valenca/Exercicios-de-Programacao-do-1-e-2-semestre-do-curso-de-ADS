public class Pessoa{

    //atributos
    private String nome;
    private int ano;
    private String cpf;


    //getters (Métodos de Acesso - " para ver")
    public String getNome(){
        return nome;
    }
    
    public int getAno(){
        return ano;
    }

    public String getCpf(){
        return cpf;
    }


    //construtor  (tem que colocar as informações no momento que instancia na main)
    public Pessoa (String nome, int ano, String cpf){
        this.nome = nome;
        this.ano = ano;
        this.cpf = cpf;
    }

    //nesse caso, não há necessidade de utilizar setters por conta do construtor acima.
    //exemplo de setters (Métodos de Modificação - "para atribuir"):
    /*
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    */



    //Método privado para calcular idade
    private int idade (int anoAtual) {

        return anoAtual - ano;

    }

    //Método público para acessar o método acima
    public int calculaIdade(int anoAtual){

        return idade(anoAtual);

    }


}
