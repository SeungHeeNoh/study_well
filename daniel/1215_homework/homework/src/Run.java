import java.util.List;

import controller.SweetPotatoController;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController bookController = new SweetPotatoController();

		List<SweetPotato> sweetPotatoBox1 = bookController.filter( (a) -> a.getType().equals("밤고구마") );
		List<SweetPotato> sweetPotatoBox2 = bookController.filter( (a) -> a.getWeight() > 500 );
		List<SweetPotato> sweetPotatoBox3 = bookController.filter( (a) -> a.getWeight() < 200 );
		List<SweetPotato> sweetPotatoBox4 = bookController.filter( (a) -> a.getWeight() > 500 && a.getType().equals("호박고구마") );
		
		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);
	}
}
