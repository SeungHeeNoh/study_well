import java.util.List;

import controller.SweetPotatoController;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController bookController = new SweetPotatoController();

		List<SweetPotato> sweetPotatoBox1 = bookController.filter((SweetPotato potato) -> "밤고구마".equals(potato.getType()));
		List<SweetPotato> sweetPotatoBox2 = bookController.filter((SweetPotato potato) -> potato.getWeight() > 500);
		List<SweetPotato> sweetPotatoBox3 = bookController.filter((SweetPotato potato) -> 200 > potato.getWeight());
		List<SweetPotato> sweetPotatoBox4 = bookController.filter((SweetPotato potato) -> 500 < potato.getWeight() && "호박고구마".equals(potato.getType()));
		
		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);
	}
}
