package entities;

public class Carrinho extends Produto {
	private int estoqueCarrinho;
	private double valorCarrinho;
	
	
	
	public Carrinho(String produto, String codigo, double valor, int estoque, int estoqueCarrinho,
			double valorCarrinho) {
		super(produto, codigo, valor, estoque);
		this.estoqueCarrinho = estoqueCarrinho;
		this.valorCarrinho = valorCarrinho;
	}



	public int getEstoqueCarrinho() {
		return estoqueCarrinho;
	}
	public void setValorCarrinho(double valorCarrinho) {
	}
	public void compra(int quantidade,double auxvalor,int estoque) {
		//if(quantidade<= estoque && quantidade>0 && estoque>=0)  {
		System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
		estoqueCarrinho = estoqueCarrinho+quantidade;
		valorCarrinho = valorCarrinho+(quantidade*auxvalor);
		System.out.println(" Carrinho: " + estoqueCarrinho + "PRODUTOS " + "VALOR TOTAL DO CARRINHO " + valorCarrinho);
		//}
		//else if (quantidade > estoque){
	}


}
