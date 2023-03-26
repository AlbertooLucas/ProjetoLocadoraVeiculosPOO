public class Carro extends Veiculo {
    private int numPortas;
    private boolean arCondicionado;
    private int capacidadePassageiros;
    private String cor;
    private Motor motor;
    private List<String> acessorios;
    private int numAirbags;
    private boolean isAutomatico;

    public Carro(String placa, String modelo, String marca, int ano, double diaria, boolean disponivel, int numPortas, boolean arCondicionado, int capacidadePassageiros, String cor, Motor, motor, List<String> acessorios, int numAirbags, boolean isAutomatico) {
        super(placa, modelo, marca, ano,diaria, disponivel);
        this.numPortas = numPortas;
        this.arCondicionado = arCondicionado;
        this.capacidadePassageiros = capacidadePassageiros;
        this.cor = cor;
        this.motor = motor;
        this.acessorios = acessorios;
        this.numAirbags = numAirbags;
        this.isAutomatico = isAutomatico;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public boolean isAutomatico() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<String> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<String> acessorios) {
        this.acessorios = acessorios;
    }

    public int getNumAirbags() {
        return numAirbags;
    }

    public void setNumAirbags(int numAirbags) {
        this.numAirbags = numAirbags;
    }

    public boolean isAutomatico() {
        return isAutomatico;
    }

    public void setAutomatico(boolean isAutomatico) {
        this.isAutomatico = isAutomatico;
    }
}

