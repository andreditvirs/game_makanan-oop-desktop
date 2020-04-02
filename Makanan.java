import java.util.ArrayList;

public class Makanan{

	protected String jenis;
	protected Makanan makanan;
	
	public Makanan(String jenis){
		this.jenis=jenis;
	}

	public String toString(){
		return jenis;
	}

	public String getNama(){
		return jenis;
	}

	public void setNama(String jenis){
		this.jenis=jenis;
	}
}