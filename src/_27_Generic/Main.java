package _27_Generic;

public class Main {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData();
//        responseData.setData1("어떠한 데이터");
//        responseData.setMessage("String 데이터 메시지: ");
//        System.out.println(responseData.toStringStr());

        ResponseData<String> data1 = new ResponseData<>();
        ResponseData<Integer> data2 = new ResponseData<>();
        data1.setMessage("String 메시지: ");
        data1.setData("String Data");
        System.out.println(data1);
        data2.setMessage("Integer 메시지: ");
        data2.setData(1234567);
        System.out.println(data2);

        System.out.println(GenericEx.identify(123));
        System.out.println(GenericEx.identify("123"));
    }
}
