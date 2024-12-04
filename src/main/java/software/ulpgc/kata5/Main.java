package software.ulpgc.kata5;

import software.ulpgc.kata5.io.*;

public class Main {
    public static void main(String[] args) {
        UserLoader loader = new RandomUserLoader(
                new RaandomUserReader(),
                new RandomUserDeserializer(),
                new RandomUserAdapter()
        );
        for (int i = 0; i < 15; i++) {
            System.out.println(loader.load().name());
        }
    }
}
