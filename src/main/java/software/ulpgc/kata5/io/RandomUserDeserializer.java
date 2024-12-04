package software.ulpgc.kata5.io;

import com.google.gson.Gson;

public class RandomUserDeserializer implements UserDeserialzer{
    @Override
    public Object deserialize(String json) {
        return new Gson().fromJson(json, RandomUserGetResponse.class);}
}
