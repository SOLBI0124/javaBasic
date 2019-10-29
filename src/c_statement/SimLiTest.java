package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String answer;

		/*
		 * System.out.println("1.나는 금사빠다(금방 사랑에 빠진다)>"); answer = s.nextLine();
		 * System.out.println("2.연애할 때 끌려다니는 타입이다>"); answer = s.nextLine();
		 * System.out.println("3.데이터코스는 미리 짜는게 편하다>"); answer = s.nextLine();
		 * System.out.println("4.감정기복이 크지 않다>"); answer = s.nextLine();
		 * System.out.println("5.감정 표현에 솔직한 편이다>"); answer = s.nextLine();
		 * System.out.println("6.활동적인 데이트가 좋다>"); answer = s.nextLine();
		 * System.out.println("7.연락이 없어도 믿고기다리는 편이다>"); answer = s.nextLine();
		 * System.out.println("8.이성친구는 존재할 수 없다>"); answer = s.nextLine();
		 * System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>"); answer =
		 * s.nextLine();
		 */

		System.out.println("나는 금사빠다>");
		answer = s.nextLine();
		if (answer.equals("y")) {
			System.out.println("2.연애할 때 끌려다니는 타입이다>");
			answer = s.nextLine();
			if (answer.equals("y")) {
				System.out.println("5.감정 표현에 솔직한 편이다>");
				answer = s.nextLine();
				if (answer.equals("y")) {
					System.out.println("8.이성친구는 존재할 수 없다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("D.아침에주스 유기농 타입");
							System.out
									.println("서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
						} else {
							System.out
									.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						}
					} else {
						System.out
								.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
					}
				} else {
					System.out.println("6.활동적인 데이트가 좋다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("8.이성친구는 존재할 수 없다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
							answer = s.nextLine();
							if (answer.equals("y")) {
								System.out.println("D.아침에주스 유기농 타입");
								System.out
										.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else {
								System.out
										.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							}
						} else {
							System.out
									.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
						}

					} else {
						System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("D.아침에주스 유기농 타입");
							System.out
									.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else {
							System.out
									.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						}

					}

				}
			} else {
				System.out.println("3.데이터코스는 미리 짜는게 편하다>");
				answer = s.nextLine();
				if (answer.equals("y")) {
					System.out.println("5.감정 표현에 솔직한 편이다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("8.이성친구는 존재할 수 없다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
							answer = s.nextLine();
							if (answer.equals("y")) {
								System.out.println("D.아침에주스 유기농 타입");
								System.out
										.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else {
								System.out
										.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							}
						} else {
							System.out
									.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
						}
					} else {
						System.out.println("6.활동적인 데이트가 좋다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("8.이성친구는 존재할 수 없다>");
							answer = s.nextLine();
							if (answer.equals("y")) {
								System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
								answer = s.nextLine();
								if (answer.equals("y")) {
									System.out.println("D.아침에주스 유기농 타입");
									System.out
											.println("서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
								} else {
									System.out
											.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
								}
							} else {
								System.out
										.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
							}

						} else {
							System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
							answer = s.nextLine();
							if (answer.equals("y")) {
								System.out.println("D.아침에주스 유기농 타입");
								System.out
										.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else {
								System.out
										.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							}

						}

					}
				} else {
					System.out.println("6.활동적인 데이트가 좋다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("8.이성친구는 존재할 수 없다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
							answer = s.nextLine();
							if (answer.equals("y")) {
								System.out.println("D.아침에주스 유기농 타입");
								System.out
										.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else {
								System.out
										.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							}
						} else {
							System.out
									.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
						}

					} else {
						System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("D.아침에주스 유기농 타입");
							System.out
									.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else {
							System.out
									.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						}

					}

				}
			}
		} else {
			System.out.println("4.감정기복이 크지 않다>");
			answer = s.nextLine();
			if (answer.equals("y")) {
				System.out.println("7.연락이 없어도 믿고기다리는 편이다>");
				answer = s.nextLine();
				if (answer.equals("y")) {
					System.out
							.println("A.서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입");

				} else {
					System.out.println("8.이성친구는 존재할 수 없다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("D.아침에주스 유기농 타입");
							System.out
									.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else {
							System.out
									.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						}
					} else {
						System.out
								.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
					}

				}
			} else {
				System.out.println("5.감정 표현에 솔직한 편이다>");
				answer = s.nextLine();
				if (answer.equals("y")) {
					System.out.println("8.이성친구는 존재할 수 없다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("D.아침에주스 유기농 타입");
							System.out
									.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else {
							System.out
									.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						}
					} else {
						System.out
								.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
					}
				} else {
					System.out.println("6.활동적인 데이트가 좋다>");
					answer = s.nextLine();
					if (answer.equals("y")) {
						System.out.println("8.이성친구는 존재할 수 없다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
							answer = s.nextLine();
							if (answer.equals("y")) {
								System.out.println("D.아침에주스 유기농 타입");
								System.out
										.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							} else {
								System.out
										.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
							}
						} else {
							System.out
									.println("B.구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입");
						}

					} else {
						System.out.println("9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다>");
						answer = s.nextLine();
						if (answer.equals("y")) {
							System.out.println("D.아침에주스 유기농 타입");
							System.out
									.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						} else {
							System.out
									.println("C.이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
						}

					}

				}

			}
		}
	}
}
