package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://api.hello-avatar.com/adorables/1.png"),
            new User("002", "Paul", "https://api.hello-avatar.com/adorables/2.png"),
            new User("003", "Phil", "https://api.hello-avatar.com/adorables/3.png"),
            new User("004", "Guillaume", "https://api.hello-avatar.com/adorables/4.png"),
            new User("005", "Francis", "https://api.hello-avatar.com/adorables/5.png"),
            new User("006", "George", "https://api.hello-avatar.com/adorables/6.png"),
            new User("007", "Louis", "https://api.hello-avatar.com/adorables/7.png"),
            new User("008", "Mateo", "https://api.hello-avatar.com/adorables/8.png"),
            new User("009", "April", "https://api.hello-avatar.com/adorables/9.png"),
            new User("010", "Louise", "https://api.hello-avatar.com/adorables/10.png"),
            new User("011", "Elodie", "https://api.hello-avatar.com/adorables/11.png"),
            new User("012", "Helene", "https://api.hello-avatar.com/adorables/12.png"),
            new User("013", "Fanny", "https://api.hello-avatar.com/adorables/13.png"),
            new User("014", "Laura", "https://api.hello-avatar.com/adorables/14.png"),
            new User("015", "Gertrude", "https://api.hello-avatar.com/adorables/15.png"),
            new User("016", "Chloé", "https://api.hello-avatar.com/adorables/16.png"),
            new User("017", "April", "https://api.hello-avatar.com/adorables/17.png"),
            new User("018", "Marie", "https://api.hello-avatar.com/adorables/18.png"),
            new User("019", "Henri", "https://api.hello-avatar.com/adorables/19.png"),
            new User("020", "Rémi", "https://api.hello-avatar.com/adorables/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://api.hello-avatar.com/adorables/21.png"),
            new User("022", "Geoffrey", "https://api.hello-avatar.com/adorables/22.png"),
            new User("023", "Simon", "https://api.hello-avatar.com/adorables/23.png"),
            new User("024", "André", "https://api.hello-avatar.com/adorables/24.png"),
            new User("025", "Leopold", "https://api.hello-avatar.com/adorables/25.png")
    );
}
