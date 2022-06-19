package aplicacao;

//aplicacao.Gerente eh um aplicacao.Funcionario, aplicacao.Gerente herda da class aplicacao.Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do aplicacao.Designer");
		return 200;
	}	

}
