package f_oop2;

public class Store {

	public static void main(String[] args) {

		Customer c = new Customer();

		Product p = new Desktop(); // 타입은 부모타입, 실제 인스턴스는 자식타입.
		p.info(); // 물건정보
		c.buy(p);

		Product p1 = new TV();
		p1.info();
		c.buy(p1);

		c.showItem();
		// Product타입의 변수 p가 Desktop도 될 수 있고, TV도 될 수 있다.
		// 이렇게 여러가지 형태를 가지는 특징을 다형성이라고 한다.
	}

}


class Product {		// 부모클래스
	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void info() {
		System.out.println("----------------");
		System.out.println("상품명 : " + name);
		System.out.println("금액 : " + price + "원");
		System.out.println("----------------");
	}
}



class Desktop extends Product {
	Desktop() {
		super("삼성컴퓨터", 500000); // 부모 클래스(Product)의 생성자 호출
	}
}

class TV extends Product {
	TV() {
		super("LG TV", 1000000);
	}
}

class Customer {
	int money = 200000000;
	Product[] item = new Product[10]; // 장바구니. Product타입의 배열

	void buy(Product p) { // 물건 구매 메서드, Product타입을 파라미터로 받겠다
		if (money < p.price) {
			System.out.println("돈이 부족하다.");
			return;
		}
		money -= p.price;

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) { // item 빈곳에 저장
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
	}

	void showItem() { // 현재구매한 물건을 보여주는 메서드
		System.out.println("------ 장바구니 ------");
		for (int i = 0; i < item.length; i++) {
			if (item[i] != null) {
				System.out.println(i + 1 + ". " + item[i].name);
			}
		}
		System.out.println("-------------------");
	}
}
