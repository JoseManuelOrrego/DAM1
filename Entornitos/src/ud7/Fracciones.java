package ud7;

public class Fracciones
{
	
	//atributos
	private int num;
	private int deno;
	
	//constructor
	public Fracciones(int num, int deno) {
		this.num=num;
		this.deno=deno;
	}
	//setter
	public void Simplificar() {
		int div=1;
		
		if(deno%num==0) {
			deno=num;
			num=1;
		}
		else{
			for(int i=1;i<deno;i++) {
				if(deno%i==0) {
					if(num%i==0) {
						div=i;
					}
				}
			}
			num=num/div;
			deno=deno/div;
		}
			
	}
	//getter
	public int DameNum() {
		return num;
	}
	public int DameDeno() {
		return deno;
	}
	
	public Fracciones Suma(Fracciones f2) {
		int num2=f2.DameNum();
		int deno2=f2.DameDeno();
		int numR=(num*deno2)+(num2*deno);
		int denoR=(deno*deno2);
		
		Fracciones fR=new Fracciones(numR,denoR);
		return fR;
	}
	public Fracciones Resta(Fracciones f2) {
		int num2=f2.DameNum();
		int deno2=f2.DameDeno();
		int numR=(num*deno2)-(num2*deno);
		int denoR=(deno*num);
		
		Fracciones fR=new Fracciones(numR,denoR);
		return fR;
	}
	public Fracciones Multi(Fracciones f2) {
		int num2=f2.DameNum();
		int deno2=f2.DameDeno();
		int numR=num*num2;
		int denoR=deno*deno2;
		
		Fracciones fR=new Fracciones(numR,denoR);
		return fR;
	}
	public Fracciones Divi(Fracciones f2) {
		int num2=f2.DameNum();
		int deno2=f2.DameDeno();
		int numR=num*deno2;
		int denoR=deno*num2;
		
		Fracciones fR=new Fracciones(numR,denoR);
		return fR;
	}
	
	public boolean esIgual(Fracciones f2) {
		Fracciones f1=new Fracciones(num,deno);
		f1.Simplificar();
		f2.Simplificar();
		if(f1.DameDeno()==f2.DameDeno() && f2.DameNum()==f1.DameNum()) {
			return true;
		}
		return false;
	}
	
	public void Mostrar() {
		System.out.println(num+"/"+deno);
	}
	

}
