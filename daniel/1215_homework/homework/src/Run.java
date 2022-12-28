import java.util.List;

import controller.SweetPotatoController;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController sweetPotatoController = new SweetPotatoController();

		List<SweetPotato> sweetPotatoBox1 = sweetPotatoController.filter( (SweetPotato) -> "밤고구마".equals(SweetPotato.getType()) );
		List<SweetPotato> sweetPotatoBox2 = sweetPotatoController.filter( (SweetPotato) -> SweetPotato.getWeight() > 500 );
		List<SweetPotato> sweetPotatoBox3 = sweetPotatoController.filter( (SweetPotato) -> SweetPotato.getWeight() < 200 );
		List<SweetPotato> sweetPotatoBox4 = sweetPotatoController.filter( (SweetPotato) -> SweetPotato.getWeight() > 500 && "호박고구마".equals(SweetPotato.getType()) );
		
		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);
	}
}
