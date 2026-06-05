package Test;

public class Warrior { // 클래스 이름
    // 🗄️ 부모의 필드
    public String name; // Warrior의 이름?

    // 🚪 부모의 매개변수 생성자
    public Warrior(String name) { // Warrior의 이름
        this.name = name; // 이것의 이름은 name
        System.out.println("▶ [부모 생성자] 원조 전사 '" + this.name + "' 캐릭터가 메모리에 생성되었습니다.");
    }

    // ⚔️ 부모의 메서드
    public void attack() { // 공격시
        System.out.println("⚔️ [부모 메서드] 기본 검으로 휘두르기 공격!");
    }
}

