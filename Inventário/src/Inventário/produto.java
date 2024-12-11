package Inventário;

public class produto {
	//Declarações de campo de instância
	private int itemNúmero;
	private String nome;
	private int qtdEstoque;
	private double preço;
	private boolean ativo = true;
	
	public produto()
	{
	}
	
	public produto(int número,String nome,int qtd,double preço)
	{
		this.itemNúmero = número;
		this.nome = nome;
		this.qtdEstoque = qtd;
		this.preço = preço;
	}
	public int getitemNúmero() {
		return itemNúmero;
	}
	
	public void setitemNúmero(int itemNúmero) {
		this.itemNúmero = itemNúmero;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getqtdEstoque() {
		return qtdEstoque;
	}
	public void setqtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public double getpreço() {
		return preço;
	}
	public void setpreço(double preço) {
		this.preço = preço;
	}
	public boolean getActive() {
		return ativo;
	}
	public void setativo(boolean ativo) {
		this.ativo = ativo;
	}
	public double getInventoryValue()
	{
		return preço * qtdEstoque;
	}
	
	public String toString()
	{
		return "\n\nItem Número        :"+this.itemNúmero
				+"\nNome                :"+this.nome
				+"\nQuantidade em estoque:"+this.qtdEstoque
				+"\nPreço               :"+this.preço
				+"\nValor do Estoque    :"+getInventoryValue()
				+"\nProduto Status      :"+(this.ativo?"ativo":"Desativo");
	}
	
}
