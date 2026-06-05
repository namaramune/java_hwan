package Test;

public class NeoWarrior extends Warrior {
    // 🗄️ 자식의 필드 (부모와 이름이 똑같음!)
    public String name = "네오 전사"; // 케릭터 이름을 네오전사로 설정

    // 🚪 자식의 생성자
    public NeoWarrior(String parentName, String childName) {// 무슨 뜻인지 모르겠어,
        // ① super(인수) : 부모 생성자를 강제로 먼저 깨웁니다! (무조건 첫 줄에 와야 함)
        super(parentName); // parentName은 부모 이름이다

        this.name = childName; // 이것의 이름은 childName이다
        System.out.println("▶ [자식 생성자] 업그레이드 네오 전사 '" + this.name + "' 세팅 완료!");
    }

    // ⚔️ 메서드 오버라이딩 (부모의 attack을 덮어쓰기)
    @Override
    public void attack() {// 공경을 명령
        System.out.println("🔥 [자식 오버라이딩] 레이저 빔 검으로 초강력 공격!!");
    }

    // 🧭 super와 this의 차이를 눈으로 확인하는 기능 상자
    public void showStatus() { // 정보를 보여줘
        // 이름이 겹쳤을 때 super와 this로 명확하게 주소를 찍어줍니다.
        System.out.println("this.name (내 방 서랍)  : " + this.name);
        System.out.println("super.name (부모 방 서랍): " + super.name);

        // 그냥 attack()을 부르면 자식이 리모델링한 레이저 공격이 나가지만,
        System.out.print("그냥 attack() 호출 -> ");
        attack(); // 이게 무슨뜻이야? 공격 명령어 인건가

        // super.attack()을 부르면 부모 방에 있던 옛날 기본 공격을 강제로 가져옵니다!
        System.out.print("super.attack() 호출 -> ");
        super.attack(); // 이건 부모 공격 명령어 이고?
    }
}

