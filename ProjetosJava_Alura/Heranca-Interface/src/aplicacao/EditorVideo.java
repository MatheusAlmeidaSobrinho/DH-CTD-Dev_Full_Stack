package aplicacao;

//aplicacao.Gerente eh um aplicacao.Funcionario, aplicacao.Gerente herda da class aplicacao.Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de video");
		return 150;
	}	

}
