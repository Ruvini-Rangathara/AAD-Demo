package com.example.demo1ee;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(value = "/jsontype", urlPatterns = {"/jsontype", "/com/example/demo1ee/JsonTypeHandle.java"})
public class JsonTypeHandle extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if(req.getContentType() == null || ! req.getContentType().toLowerCase().startsWith("application/json")){
            resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        }
//
//        BufferedReader reader = req.getReader();
//        StringBuilder sb = new StringBuilder();
//        reader.lines().forEach(line -> sb.append(line+"\n"));
//        System.out.println(sb);


        JsonReader reader = Json.createReader(req.getReader());
//        JsonObject jsonObject = reader.readObject();
//        String name = jsonObject.getString("name");
//        System.out.println(name);

        //------------------ Json array ---------------- parsson dependancy not needed, it handles yasson

        JsonArray jsonArray = reader.readArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject = jsonArray.getJsonObject(i);
            System.out.println(jsonObject.getString("name"));
            System.out.println(jsonObject.getString("city"));
            System.out.println();
        }

        // sample request
//        [
//            {
//                "name": "Ruvini",
//                    "city": "Panadura"
//            },
//            {
//                "name": "Sachini",
//                    "city": "Panadura"
//            }
//        ]


    }
}


