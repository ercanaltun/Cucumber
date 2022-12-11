package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

public class ObjectMapperUtils {

    //new ObjectMapper().readValue(jsonInString, HashMap.class);

    private static ObjectMapper mapper;
    static {
        mapper=new ObjectMapper();
    }
    public static <T> T convertJsonToJava(String json,Class<T>cls){//Generic method
             T javaResult=null;
        try {
            javaResult=mapper.readValue(json,cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return javaResult;
    }
}
