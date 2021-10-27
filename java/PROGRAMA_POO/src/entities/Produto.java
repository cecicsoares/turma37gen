package entities;

public class Produto {
	private String produto;
	private String codigo;
	private double valor;
	private int estoque;
	
	//Construtor
	public Produto(String produto, String codigo, double valor, int estoque) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}


	public void comprar(int quantidade) {
		if(quantidade<=estoque && quantidade>0 && estoque>=0) {
			estoque=estoque - quantidade;
			System.out.println("Compra realizada com sucesso!");
		}

	}
			@Override
			public String toString() {
				 return codigo+"\t"+produto+" \t \t       "+valor+"  \t      \t"+estoque;
			}



			public Integer getKey() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getProduto() {
				// TODO Auto-generated method stub
				return null;
			}

			public double getValor() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getEstoque() {
				// TODO Auto-generated method stub
				return 0;
			}




		} 

}
