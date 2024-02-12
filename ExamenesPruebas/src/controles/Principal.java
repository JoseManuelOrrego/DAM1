package controles;

import java.util.Random;

public class Principal 
{
	public static void main(String[] args) 
	{
		ProductoElectronico [] catalogo = {new Telefono("Apple", "iphone16", 1500, 2024, 5.8, "iOS"), new Telefono("Google", "Pixel 9 Pro", 1499
				, 2025, 6, "Android"), new Portatil("HP", "Envilion Super", 1899, 2020, 1000, "i9-2600"), new Portatil("Apple", "Macbook", 2399, 
						2022, 2000, "M3 Ultra"), new Consola("Microsoft", "Xbox Series X", 499, 2020, "Negro", "4K"), new Consola("Nintendo", "Switch",
								399, 2017, "Rojo-Azul", "1080")};
		
		Random random = new Random();
		int uno = 0, dos = 0, tres = 0;
		for(int i = 0; i < 3; i++)
		{
			boolean correcto = false;
			while(!correcto)
			{
				int numElegido = random.nextInt(catalogo.length);
				if(uno != numElegido|| dos != numElegido|| tres != numElegido)
				{
					if(i == 0)
						uno = numElegido;
					if(i == 1)
						dos = numElegido;
					if(i == 2)
						tres = numElegido;
					ProductoElectronico elegido = catalogo[numElegido];
					elegido.encender();
					elegido.apagar();
					elegido.getDetalles();
					correcto = true;
				}
				
			}
		}
	}
}