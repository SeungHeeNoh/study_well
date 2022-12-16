import java.util.List;

import controller.SweetPotatoController;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController bookController = new SweetPotatoController();

		List<SweetPotato> sweetPotatoBox1 = bookController.filterByType("밤고구마");
		List<SweetPotato> sweetPotatoBox2 = bookController.filterGreaterThan(500);
		List<SweetPotato> sweetPotatoBox3 = bookController.filterByLessThan(200);
		List<SweetPotato> sweetPotatoBox4 = bookController.filterGreaterThanAndType(500, "호박고구마");
		
		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);
	}
}
