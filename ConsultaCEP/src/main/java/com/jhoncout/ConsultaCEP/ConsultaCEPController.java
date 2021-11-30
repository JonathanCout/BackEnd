package com.jhoncout.ConsultaCEP;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaCEPController {

    @GetMapping("/{cep}")
    public String getCep(@PathVariable String cep) throws UnirestException {
        HttpResponse<JsonNode> response = Unirest.get(String.format("https://viacep.com.br/ws/%s/json/",cep)).asJson();

        JSONObject object = response.getBody().getObject();

        return object.toString();

    }
}
