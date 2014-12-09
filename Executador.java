import java.io.File;
import java.io.IOException;

public class Executador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*File diretorio = new File("/home/breno");
		File[] arquivos = diretorio.listFiles();
		int length = arquivos.length;

		for (int i = 0; i < length; ++i) {
			File f = arquivos[i];

			if (f.isFile()) {
				System.out.println(f.getName());
			} else if (f.isDirectory()) {
				System.out.println("Diretorio: " + f.getName());
			}
		}*/
		
		Runtime c = Runtime.getRuntime();
		try {
			c.exec("zsnes /home/breno/3d.smc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
