import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class prueba {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String alquiler = "29/08/1992";
		String devolucion = "29/09/1992";
		Date Inicio = new Date();
		try {
			Inicio = sdf.parse(alquiler);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date Fin = new Date();
		try {
			Fin = sdf.parse(devolucion);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sdf.format(Fin));
		System.out.println(sdf.format(Inicio));

	}

}
