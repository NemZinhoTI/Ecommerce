public class Eletronico extends Produto {
    private String marca;
    private String modelo;  

    public Eletronico(String nome, double preco, String marca, String modelo){
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;    
    }
    
    public String getModelo(){
        return modelo;
    }
    
}
