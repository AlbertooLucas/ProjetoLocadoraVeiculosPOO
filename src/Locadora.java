import java.util.ArrayList;
import java.util.List;

public class Locadora {
	private String nome;
	private String endereco;
	private String telefone;
	private List<Veiculo> veiculosDisponiveis;
	private List<Locacao> locacoesAtivas;
	
	public Locadora(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.veiculosDisponiveis = new ArrayList<Veiculo>();
		this.locacoesAtivas = new ArrayList<Locacao>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelofone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Veiculo> getVeiculosDisponiveis() {
		return veiculosDisponiveis;
	}
	
	public void setVeiculosDisponiveis(List<Veiculo> veiculosDisponiveis) {
		this.veiculosDisponiveis = veiculosDisponiveis;
	}
	
	public List<Locacao> getLocacoesAtivas(){
		return locacoesAtivas;
	}
	
	public void setLocacoesAtivas(List<Locacao> locacoesAtivas) {
		this.locacoesAtivas = locacoesAtivas;
	}
	
	public void adicionarVeiculo(Veiculo veiculo) {
		this.veiculosDisponiveis.add(veiculo);
	}
	
	public vois removerVeiculo(Veiculo veiculo) {
		this.veiculosDiponiveis.remove(veiculo);
	}
	
	pubnlic void realizarLocacao(Veiculo veiculo, Cliente cliente, String dataInicio, String dataFim) {
		if (this.veiculosDisponiveis.contains(veiculo)) {
			Locacao locacao = new Locacao(veiculo, cliente, dataInicio, dataFim);
			this.locacoesAtivas.add(locacao);
			this.veiculosDisponiveis.remove(veiculo);
			System.out.println("Locação realizada com sucesso.");
		} else {
			System.out.println("Veículo não disponível para locação")
		}
	}
	
	public void encerrarLocacao(Locacao locacao) {
		if (this.locacoesAtivas.contains(locacao)) {
			locacao.encerrar();
			this.veiculosDisponiveis.add(locacao.getVeiculo());
			this.locacoesAtivas.remove(locacao);
			System.out.println("Locação encerrada com sucesso.");
		} else {
			System.out.println("Locação não encontrada."):
		}
	}
}
