import java.util.ArrayList;
import java.util.List;

import controller.PotatoController;
import controller.SweetPotatoController;
import vo.Potato;
import vo.SweetPotato;

public class Run {
	public static void main(String[] args) throws Exception {
		List<SweetPotato> sweetPotatoField;
		List<Potato> potatoField;
		
		sweetPotatoField = new ArrayList<>();
		sweetPotatoField.add(new SweetPotato("밤고구마", 600));
		sweetPotatoField.add(new SweetPotato("호박고구마", 580));
		sweetPotatoField.add(new SweetPotato("밤고구마", 150));
		sweetPotatoField.add(new SweetPotato("밤고구마", 333));
		sweetPotatoField.add(new SweetPotato("호박고구마", 320));
		sweetPotatoField.add(new SweetPotato("호박고구마", 610));

		potatoField = new ArrayList<>();
		potatoField.add(new Potato("봄감자", 200, "경기 여주"));
		potatoField.add(new Potato("봄감자", 580, "전북 김제"));
		potatoField.add(new Potato("봄감자", 150, "전남 보성"));
		potatoField.add(new Potato("봄감자", 333, "경남 밀양"));
		potatoField.add(new Potato("고랭지 감자", 320, "강원도 평창"));
		potatoField.add(new Potato("가을 감자", 610, "제주"));

		SweetPotatoController sweetPotatoController = new SweetPotatoController();
		PotatoController potatoController = new PotatoController();

		List<SweetPotato> sweetPotatoBox1 = sweetPotatoController.filterByType(sweetPotatoField, "밤고구마");
		List<SweetPotato> sweetPotatoBox2 = sweetPotatoController.filterGreaterThan(sweetPotatoField, 500);
		List<SweetPotato> sweetPotatoBox3 = sweetPotatoController.filterByLessThan(sweetPotatoField, 200);
		List<SweetPotato> sweetPotatoBox4 = sweetPotatoController.filterGreaterThanAndType(sweetPotatoField, 500, "호박고구마");

		System.out.println(sweetPotatoBox1.size() == 3);
		System.out.println(sweetPotatoBox2.size() == 3);
		System.out.println(sweetPotatoBox3.size() == 1);
		System.out.println(sweetPotatoBox4.size() == 2);

		List<Potato> potatoBox1 = potatoController.filterByType(potatoField, "봄감자");
		List<Potato> potatoBox2 = potatoController.filterGreaterThan(potatoField, 330);
		List<Potato> potatoBox3 = potatoController.filterByOrigin(potatoField, "제주");
		List<Potato> potatoBox4 = potatoController.filterByNotType(potatoField, "봄감자");

		System.out.println(potatoBox1.size() == 4);
		System.out.println(potatoBox2.size() == 3);
		System.out.println(potatoBox3.size() == 1);
		System.out.println(potatoBox4.size() == 2);
	}
}
