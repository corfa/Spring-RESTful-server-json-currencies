package com.example.restservis;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONutil {

    public static URL createUrl(String link) {
        try {
            return new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String parseUrl(URL url) {
        if (url == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String NameCoin(JSONObject coin){
        String Name = (String) coin.get("Name");
        return Name;
    }

    public static Double ValueCoin(JSONObject coin) {
        Double Value = (Double) coin.get("Value");
        return Value;}

        public static String CharCodeCoin(JSONObject coin){
        String CharCode = (String) coin.get("CharCode");
        return CharCode;
    }
    public static JSONObject ParseData(String param) throws ParseException {
        String https_url="https://www.cbr-xml-daily.ru/daily_json.js";
        URL url=createUrl(https_url);
        String result=JSONutil.parseUrl(url);
        JSONObject GlobalMass = (JSONObject) JSONValue.parseWithException(result);
        JSONObject Valute= (JSONObject) GlobalMass.get("Valute");
        JSONObject coin=(JSONObject) Valute.get(param);
        return coin;
    }


}
