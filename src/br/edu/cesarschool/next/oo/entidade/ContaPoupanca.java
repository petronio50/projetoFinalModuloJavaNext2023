package br.edu.cesarschool.next.oo.entidade;

public class ContaPoupanca extends ContaCorrente {
	private double percentualDeBonus;
	
	public ContaPoupanca (double percentualDeBonus) {
		this.percentualDeBonus = percentualDeBonus;
		
	}
	public ContaPoupanca(String numero, double saldo, String nomeCorrentista, double percentualDeBonus) {
		super(numero, saldo, nomeCorrentista);
		this.percentualDeBonus = percentualDeBonus;
		
	}
	public double getPercentualDeBonus() {
		return percentualDeBonus;
	}
	public void setPercentualDeBonus(double percentualDeBonus) {
		this.percentualDeBonus = percentualDeBonus;
	}
	@Override 
	public void creditar(double valor) {
		super.creditar(super.getSaldo() + valor * (1 + this.percentualDeBonus) / 100);
	}
	@Override
	public String toString() {
	return super.toString() + "Percentual de Bonus" + percentualDeBonus; 
	}	
}
