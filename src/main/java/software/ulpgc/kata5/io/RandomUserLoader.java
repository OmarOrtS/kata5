package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.User;

public class RandomUserLoader implements UserLoader{
    private final UserReader reader;
    private final UserDeserialzer deserialzer;
    private final UserAdapter adapter;

    public RandomUserLoader(UserReader reader, UserDeserialzer deserializer, UserAdapter adapter) {
        this.reader = reader;
        this.deserialzer = deserializer;
        this.adapter = adapter;
    }

    @Override
    public User load() { return adapter.adapt(deserialzer.deserialize(reader.read())); }
}
