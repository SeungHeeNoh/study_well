import java.util.List;

import controller.SweetPotatoController;
import vo.Potato;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController sweetPotatoController = new SweetPotatoController();

		List<SweetPotato> sweetPotatoBox1 = sweetPotatoController.filter(SweetPotato.class ,(SweetPotato potato) -> "밤고구마".equals(potato.getType()));
		List<SweetPotato> sweetPotatoBox2 = sweetPotatoController.filter(SweetPotato.class,(SweetPotato potato) -> potato.getWeight() > 500);
		List<SweetPotato> sweetPotatoBox3 = sweetPotatoController.filter(SweetPotato.class,(SweetPotato potato) -> 200 > potato.getWeight());
		List<SweetPotato> sweetPotatoBox4 = sweetPotatoController.filter(SweetPotato.class, (SweetPotato potato) -> 500 < potato.getWeight() && "호박고구마".equals(potato.getType()));
		
		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);

		List<Potato> potatoBox1 = sweetPotatoController.filter(Potato.class, (Potato potato) -> "봄감자".equals(potato.getType()));/* type이 봄감자인 감자 */
		List<Potato> potatoBox2 = sweetPotatoController.filter(Potato.class, (Potato potato) -> potato.getWeight() > 330);/* 무게가 330 이상인 감자 */
		List<Potato> potatoBox3 = sweetPotatoController.filter(Potato.class, (Potato potato) -> "제주".equals(potato.getOrigin()));/* 원산지가 제주인 감자 */
		List<Potato> potatoBox4 = sweetPotatoController.filter(Potato.class, (Potato potato) -> !"봄감자".equals(potato.getType()));/* 원산지가 봄감자가 아닌 감자 */

		System.out.println(potatoBox1.size() == 4);
		System.out.println(potatoBox2.size() == 3);
		System.out.println(potatoBox3.size() == 1);
		System.out.println(potatoBox4.size() == 2);
	}
}
