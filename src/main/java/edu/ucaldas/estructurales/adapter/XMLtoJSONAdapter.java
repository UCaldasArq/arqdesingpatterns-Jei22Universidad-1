package edu.ucaldas.estructurales.adapter;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getJSON() {
        String xml = xmlService.getData();

        // Conversión MUY básica (para ejercicio)
        String json = xml
                .replace("<user>", "{")
                .replace("</user>", "}")
                .replace("<name>", "\"name\":\"")
                .replace("</name>", "\",")
                .replace("<age>", "\"age\":")
                .replace("</age>", "");

        return json;
    }
}