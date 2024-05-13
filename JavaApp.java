// Classe java que define um tipo de objeto relacionado ao Java.
public class JavaApp { 
    private String nome;

    public JavaApp(String nome) {
        this.nome = nome;
    }

    // Método getNome() que retorna o nome do objeto.
    public String getNome() {
        return nome;
    }

    // Objeto javaObj da classe Java com o nome "Java 11"
    JavaApp javaObj = new JavaApp("Java 11");

}
