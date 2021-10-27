package entities;

public class ContaEmpresa extends Conta {
	private double emprestimoEmpresa;

	public void ContEmpresa(double emprestimoEmpresa) {
		super();
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	

}