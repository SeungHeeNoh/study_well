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

		List<Potato> potatoBox1 = sweetPotatoController./* type이 봄감자인 감자 */;
		List<Potato> potatoBox2 = sweetPotatoController./* 무게가 330 이상인 감자 */;
		List<Potato> potatoBox3 = sweetPotatoController./* 원산지가 제주인 감자 */;
		List<Potato> potatoBox4 = sweetPotatoController./* 원산지가 봄감자가 아닌 감자 */;

		System.out.println(potatoBox1.size() == 4);
		System.out.println(potatoBox2.size() == 3);
		System.out.println(potatoBox3.size() == 1);
		System.out.println(potatoBox4.size() == 2);
	}
}
