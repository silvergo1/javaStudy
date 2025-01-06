package access.a;

public class AccessData {

    public int puclicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + puclicField);
    }

    void defaultMethod() {
        System.out.println("defaultField 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateField 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        puclicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
