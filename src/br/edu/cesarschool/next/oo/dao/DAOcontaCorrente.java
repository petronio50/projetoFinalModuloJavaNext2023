package br.edu.cesarschool.next.oo.dao;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.entidade.ContaCorrente;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public class DAOcontaCorrente { 
	//private CadastroObjetos cadastro = new CadastroObjetos(ContaCorrente.class);
	private DAOGenerico daoGen = new DAOGenerico(ContaCorrente.class);
	
	public boolean incluir (ContaCorrente conta) {
	//	ContaCorrente contaBusca = buscar(conta.getNumero());
	//	if (contaBusca != null) {
	//	return false;
	//	} else {
	//		cadastro.incluir(conta, conta.getNumero());
	//		return true;
			
		
	
	return daoGen.incluir(conta);
	}
	
	public boolean alterar (ContaCorrente conta) {
		ContaCorrente contaBusca = buscar(conta.getNumero());
		if (contaBusca == null) {
			return false;
		} else {
			daoGen.alterar(conta);
			return true;
	
		}
	
	} 
	public ContaCorrente buscar(String numero) {
		return (ContaCorrente) daoGen.buscar(numero);
	}
	public ContaCorrente[] buscarTodos() {
		Serializable[] rets = daoGen.buscarTodos();
		ContaCorrente [] conta = new ContaCorrente [rets.length];
		for(int i=0; i<rets.length; i++) {
			conta [i] = (ContaCorrente)rets[i];
		}
		
		return conta;
	}
}
	

