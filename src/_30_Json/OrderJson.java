package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
* jsonObject 객체를 만들고 gsonBuilder를 이용해
* json 형태로 변환 후 위와 같이 출력하시오
* */
public class OrderJson {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("orderId", "ORD123456");
        jsonObject.addProperty("customer", "곽두팔");
        jsonObject.addProperty("product", "에어팟 프로 2세대");
        jsonObject.addProperty("quantity", 1);
        jsonObject.addProperty("price", 349000);

        JsonObject address = new JsonObject();
        address.addProperty("receiver", "곽두팔");
        address.addProperty("phone", "010-5678-1234");
        address.addProperty("city", "서울");
        address.addProperty("district", "마포구");
        address.addProperty("zipCode", "04123");

        jsonObject.add("address", address);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);

    }

}
