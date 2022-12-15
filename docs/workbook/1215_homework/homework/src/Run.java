import java.util.List;

import controller.SweetPotatoController;
import controller.SweetPotatoController;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController bookController = new SweetPotatoController();

		List<SweetPotato> sweetPotatoBox1 = bookController.filterByType("밤고구마");
		List<SweetPotato> sweetPotatoBox2 = bookController.filterGreaterThan(500);
		List<SweetPotato> sweetPotatoBox3 = bookController.filterByLessThan(200);
		List<SweetPotato> sweetPotatoBox4 = bookController.filterGreaterThanAndType(500, "호박고구마");
	}
}
