package access.a;

public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 자기 자신을 만들어서 생성자로 쓸 수 있음
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }

}

class DefaultClass1 {
}

class DefaultClass2 {
}
