import java.util.List;

import controller.SweetPotatoController;
import vo.Vegetable;

public class Run {
	public static void main(String[] args) throws Exception {
		SweetPotatoController sweetPotatoController = new SweetPotatoController();
		
		List<? extends Vegetable> sweetPotatoBox1 = sweetPotatoController.filterByType("고구마", "밤고구마", true);
		List<? extends Vegetable> sweetPotatoBox2 = sweetPotatoController.filterGreaterThan("고구마", 500);
		List<? extends Vegetable> sweetPotatoBox3 = sweetPotatoController.filterByLessThan("고구마", 200);
		List<? extends Vegetable> sweetPotatoBox4 = sweetPotatoController.filterGreaterThanAndType("고구마", 500, "호박고구마");
		
		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);

		List<? extends Vegetable> potatoBox1 = sweetPotatoController.filterByType("감자", "봄감자", true);/* type이 봄감자인 감자 */
		List<? extends Vegetable> potatoBox2 = sweetPotatoController.filterGreaterThan("감자", 330);/* 무게가 330 이상인 감자 */
		List<? extends Vegetable> potatoBox3 = sweetPotatoController.filterOrigin("감자", "제주");/* 원산지가 제주인 감자 */
		List<? extends Vegetable> potatoBox4 = sweetPotatoController.filterByType("감자", "봄감자", false);/* 품종 봄감자가 아닌 감자 */

		System.out.println(potatoBox1.size() == 4);
		System.out.println(potatoBox2.size() == 3);
		System.out.println(potatoBox3.size() == 1);
		System.out.println(potatoBox4.size() == 2);
	}
}
