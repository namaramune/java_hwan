package ch11.staticTest;

class MainMethodTest{

    public void instanceMethod(){
        System.out.println("인스턴스 매서드 호출.");
    }

    public static void staticMethod(){
        System.out.println("static 매서드 호출");
    }
    // java21 이전
    public static void main(String[] args){
        // main 매서드에서 외부 매서드를 호출하는 첫번째 방법
        // static 매서드를 그냥 호출
        staticMethod();

        MainMethodTest m = new MainMethodTest();
        m.instanceMethod();
    }
    // java21 이후
    void main(){
    staticMethod();
    instanceMethod();
    }
}
