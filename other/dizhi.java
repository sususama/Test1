class  dizi{
	private String sheng;
	private String shi;
	private String jiedao;
	private int menpaihao;
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getJiedao() {
		return jiedao;
	}
	public void setJiedao(String jiedao) {
		this.jiedao = jiedao;
	}
	public int getMenpaihao() {
		return menpaihao;
	}
	public void setMenpaihao(int menpaihao) {
		this.menpaihao = menpaihao;
	}

}
public class dizhi {
	public static void main(String[] args) {
		dizi a=new dizi();
		a.setJiedao("A街道");
		a.setMenpaihao(66);
		a.setSheng("陕西省");
		a.setShi("西安市");
		System.out.print("地址为 "+a.getSheng()+" ");
		System.out.print(a.getShi()+" ");
		System.out.print(a.getJiedao()+" ");
		System.out.print(a.getMenpaihao()+"号");
	}

}