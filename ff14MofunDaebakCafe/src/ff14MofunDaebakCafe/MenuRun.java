package ff14MofunDaebakCafe;

import java.util.Scanner;

public class MenuRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("파판14 X 모펀 메뉴");
		System.out.println("1. 명계 라떼(emet)");
		System.out.println("2. 티타임 세트(venat)");
		System.out.println("3. 별바다 라떼(hythlo)");
		System.out.println("4. 레몬 에이드(hope)");
		System.out.println("5. 아메리카노 세트(americano)");
		System.out.println("6. 블루베리티 세트(blueberry)");
		System.out.println("7. 당근 주스(carrot)");
		System.out.println("8. 타르트(sand)");
		System.out.println("9. 햄버거(hamburger)");
		System.out.println("10. 창천 에이드(dragon)");
		System.out.println("11. 복숭아 케이크(peach)");
		System.out.println("12. 카레(curry)");
		System.out.println("=================================");
		System.out.println("몇 개 살거임 : ");

		int size = sc.nextInt(); // 2
		int[] menuArr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("뭐 살거임 번호로 골라 : ");
			menuArr[i] = sc.nextInt(); // [1, 2]
		}

		System.out.println("============== 합계 ==============");

		System.out.println(sumMenuPrice(menuArr) + "원");

	}

	public static int sumMenuPrice(int[] menuArr) {
		int sum = 0;

		for (int i = 0; i < menuArr.length; i++) {
			int menuNum = menuArr[i];

			switch (menuNum) {
			case 1:
				Emet emet = new Emet();
				sum += emet.getPrice();
				System.out.println("1. 명계 라떼(emet)");

				break;
			case 2:
				Venat venat = new Venat();
				sum += venat.getPrice();
				System.out.println("2. 티타임 세트(venat)");

				break;
			case 3:
				Hythlo hythlo = new Hythlo();
				sum += hythlo.getPrice();
				System.out.println("3. 별바다 라떼(hythlo)");

				break;
			case 4:
				Hope hope = new Hope();
				sum += hope.getPrice();
				System.out.println("4. 레몬 에이드(hope)");

				break;
			case 5:
				Americano americano = new Americano();
				sum += americano.getPrice();
				System.out.println("5. 아메리카노 세트(americano)");

				break;
			case 6:
				Blueberry blueberry = new Blueberry();
				sum += blueberry.getPrice();
				System.out.println("6. 블루베리티 세트(blueberry)");

				break;
			case 7:
				Carrot carrot = new Carrot();
				sum += carrot.getPrice();
				System.out.println("7. 당근 주스(carrot)");

				break;
			case 8:
				Sand sand = new Sand();
				sum += sand.getPrice();
				System.out.println("8. 타르트(sand)");

				break;
			case 9:
				Hamburger hamburger = new Hamburger();
				sum += hamburger.getPrice();
				System.out.println("9. 햄버거(hamburger)");

				break;
			case 10:
				Dragon dragon = new Dragon();
				sum += dragon.getPrice();
				System.out.println("10. 창천 에이드(dragon)");

				break;
			case 11:
				Peach peach = new Peach();
				sum += peach.getPrice();
				System.out.println("11. 복숭아 케이크(peach)");

				break;
			case 12:
				Curry curry = new Curry();
				sum += curry.getPrice();
				System.out.println("12. 카레(curry)");

				break;
			}
		}

		return sum;
	}


}
