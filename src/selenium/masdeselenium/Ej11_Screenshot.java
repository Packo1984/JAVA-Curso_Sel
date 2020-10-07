package selenium.masdeselenium;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest2;
import common.Config;
import common.Utils;

public class Ej11_Screenshot extends BaseTest2{
	
	@Test
	public void tomarEvidencia() {
		TakesScreenshot captura = (TakesScreenshot) getDriver();
		File tmpFile = captura.getScreenshotAs(OutputType.FILE);

		String pathFile = String.format("%s%s_%s.png", Config.EVIDENCIA_DIR, "evidencia", System.currentTimeMillis());
		tmpFile.renameTo(new File(pathFile));
	}
	

	@Test
	public void Test_Evidencias() {
		TakesScreenshot captura = (TakesScreenshot) getDriver();
		File tmpFile = captura.getScreenshotAs(OutputType.FILE);
		

		//obtener path especifico, fecha de ejecucion
		String fechaEjecucion = obtenerFechaFormateada("yyyyLLdd");
		// obtener nombre del método, (NOMBRE DEL TEST)
		String nombreTest = new Object(){}.getClass().getEnclosingMethod().getName();

		String pathEvidencia = Config.EVIDENCIA_DIR 
								+ fechaEjecucion 
								+ File.separator 
								+ nombreTest;
		
		System.out.println(pathEvidencia);
		
		File directorio = new File(pathEvidencia);

		if(!directorio.exists()){
			 System.out.println("CREAR ARCHIVO");
			 directorio.mkdirs();
		}		

		String pathFile = String.format("%s\\%s_%s.png", pathEvidencia, "evidencia", System.currentTimeMillis());
		tmpFile.renameTo(new File(pathFile));
	}
	
	
	private String obtenerFechaFormateada(String formato) {
		LocalDate fecha = LocalDate.now();
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
	    return fecha.format(dtf);
	}


}
