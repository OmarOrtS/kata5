package software.ulpgc.kata5.io;

import java.util.List;

public record RandomUserGetResponse (List<User> results){
    public record User(Name name, String gender, String mail){}

    public record Name(String title, String first, String last) {
    }
}
