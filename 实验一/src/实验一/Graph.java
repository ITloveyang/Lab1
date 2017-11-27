package สตั้าป;

public class Graph {
	private Bigpoint []list=new Bigpoint[50];
	private int node ,edg=-1;
	public Bigpoint[] getList() {
		return list;
	}
	public void setList(Bigpoint[] list) {
		this.list = list;
	}
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	public int getEdg() {
		return edg;
	}
	public void setEdg(int edg) {
		this.edg = edg;
	}
}
