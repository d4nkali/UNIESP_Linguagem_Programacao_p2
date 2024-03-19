package exp_1;

public class Carro {
    
private String marca, modelo; 
private int ano;

// Gerando get e set

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

public Carro () {


}

public Carro(String marca, String modelo, int ano) {

    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    
}

public Carro (String marca, String modelo) {

    this.marca = marca;
    this.modelo = modelo;

}

}