package homework;

import java.util.Scanner;
// 메소드를 활용해서 수정 해보자

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("***던전***");
        System.out.println("캐릭터 이름을 지어주세요.");
        String name = "namaramune";
        int HP = 50; // 내 에너지
        int damage = 0; // 내 피해량
        int heal = 5; // 회복 가능 횟수
        int Skill = 3; // 필살기 기술 수량
        int enemyHp = 10; // 적군 에너지
        int enemyDmage = 0; // 적군 피해량
        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");
        System.out.println("설명");
        System.out.println("던전을 클리어 하시면 됩니다.");

        enemyHp = (int) (Math.random() * 90) + 10; // 10 ~ 99

        while (true) {
            System.out.println("슬라임 HP:" + enemyHp + " 어떤 행동을 하시겠습니까?");
            System.out.println("1) 싸운다 2) 도망간다 3) HP를 회복한다 4) 스킬 사용 5) 종료 ");
            int action = s.nextInt();
            switch (action) {
                case 1 -> {
                    System.out.println("적과 싸웁니다.");
                    enemyDmage = (int) ((Math.random() * 6) +5);
                    enemyHp -= enemyDmage;
                    damage = (int) (Math.random() * 11);
                    HP -= damage;
                    System.out.println("적에게 " + enemyDmage + "만큼 데미지를 주고 " + damage + "의 데미지를 입었다.");
                    System.out.println("님의 체력은 " + HP + "입니다.");
                    System.out.println("적의 체력은 " + enemyHp + "입니다.");
                }
                case 2 -> {
                    damage = (int) (Math.random() * 5);
                    HP -= damage;
                    enemyHp = (int) (Math.random() * 90) + 10; // 10 ~ 99
                    System.out.println("도망갑니다. 대신 " + damage + "의 체력이 소비되었다.");
                    System.out.println("남은 체력은 " + HP + " 입니다.");
                }
                case 3 -> {// heal 가능 횟수를 늘리고 싶음
                    if (heal > 0) {
                        int self = (int) (Math.random() * 2);
                        int healAmount = (int) (Math.random() * 11) * self;
                        damage = (int) (Math.random() * 6);
                        HP += healAmount;
                        HP -= damage;
                        heal--;
                        if (healAmount == 0) {
                            System.out.println("회복 실패!");
                        } else {
                            System.out.println("체력이 " + healAmount + " 회복 되었다.");
                        }
                        System.out.println("적에게 " + damage + "의 데미지를 입었다.");
                        System.out.println("님의 체력은 " + HP + "입니다.");
                    } else System.out.println(" 회복을 다 사용 했습니다. ");
                }
                case 4 -> {
                    if (Skill > 0) {
                        int chance = (int) (Math.random() * 2);
                        enemyDmage = 20 * chance;
                        enemyHp -= enemyDmage;
                        damage = 15;
                        HP -= damage;
                        Skill--;
                        System.out.println("스킬을 사용했다.");
                        System.out.println("적에게 " + enemyDmage + "만큼 데미지를 주고" + damage + "의 데미지를 입었다.");
                        System.out.println("님의 체력은 " + HP + "입니다.");
                        System.out.println("적의 체력은 " + enemyHp + "입니다.");
                    } else {
                        System.out.println("사용할 수 있는 스킬 없습니다.");
                    }
                }
                case 5 -> {
                    System.out.println("게임을 종료합니다. 감사합니다.");
                    return;
                }
            }
            if (HP <= 0 || enemyHp <= 0) {

            }


            if (HP <= 0) {
                System.out.println("당신은 사망 했습니다. - The end -");
            } else if (enemyHp <= 0) {
                System.out.println("전투에 승리했습니다.");
            }


        }
    }
}
