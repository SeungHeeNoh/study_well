import java.util.List;

import controller.PotatoController;
import controller.SweetPotatoController;
import vo.Potato;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController bookController = new SweetPotatoController();
		PotatoController potatoController = new PotatoController();

		List<SweetPotato> sweetPotatoBox1 = bookController.filterByType("밤고구마");
		List<SweetPotato> sweetPotatoBox2 = bookController.filterGreaterThan(500);
		List<SweetPotato> sweetPotatoBox3 = bookController.filterByLessThan(200);
		List<SweetPotato> sweetPotatoBox4 = bookController.filterGreaterThanAndType(500, "호박고구마");

		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);

		List<Potato> potatoBox1 = potatoController.filterByType("봄감자");
		List<Potato> potatoBox2 = potatoController.filterGreaterThan(330);
		List<Potato> potatoBox3 = potatoController.filterByOrigin("제주");
		List<Potato> potatoBox4 = potatoController.filterByNotType("봄감자");

		System.out.println(potatoBox1.size() == 4);
		System.out.println(potatoBox2.size() == 3);
		System.out.println(potatoBox3.size() == 1);
		System.out.println(potatoBox4.size() == 2);
	}
}
