public class Veiculo {
    private String placa;
    private String Modelo;
    private String marca;
    private int ano;
    private double diaria;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, String marca, int ano, double diaria, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.diaria = diaria;
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        retrurn placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        thjisdisponivel = disponivel;
    }
}
