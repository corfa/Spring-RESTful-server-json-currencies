package com.example.restservis;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ValutesController {



    @GetMapping("/Valutes")
    public Valutes greeting(@RequestParam(value = "coin", defaultValue = "USD") String coin) throws ParseException {
        return new Valutes(JSONutil.NameCoin(JSONutil.ParseData(coin)),JSONutil.ValueCoin(JSONutil.ParseData(coin)),JSONutil.CharCodeCoin(JSONutil.ParseData(coin)));
    }
}
