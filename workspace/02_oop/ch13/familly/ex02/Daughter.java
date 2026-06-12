package ch13.familly.ex02;

// 추상클래스를 상속받는자식 클래스는
// 1. 추상 매서드를 모두 구형하거나
// 2. 구현하지 못하는 추상 매서드가 하나라도 남아 있을 경우 자신도 추상클래스가 됨

public class Daughter extends Parent {
    String name;
    Daughter(String name){super(name);
    }

    void play(){
        System.out.println(name + ": 코노에 간다.");
        doFaceMask();
    }

    // 마스크팩을 한다.
    private void doFaceMask(){
        System.out.println(name + "마스크 팩을 한다.");
    }

    // 앱스트링 메소드 빚 같은 개념
    public void study(){
        System.out.println(name + ": 과외를 받는다.");
    }
}