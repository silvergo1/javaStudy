package ref;

public class NullMain4 {

    public static void main(String[] args) {

        BigData bigdata = new BigData();
        bigdata.data = new Data();
        System.out.println("bigData.count = " + bigdata.count);
        System.out.println("bigData.data = " + bigdata.data);

        // NullPointerException
        System.out.println("bigData.data.value = " + bigdata.data.value);

    }

}
