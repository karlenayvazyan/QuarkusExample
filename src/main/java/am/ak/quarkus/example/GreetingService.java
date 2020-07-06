package am.ak.quarkus.example;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public GreetingModel greeting(String name) {
        return new GreetingModel("hello " + name);
    }
}
