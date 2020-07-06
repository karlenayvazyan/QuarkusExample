package am.ak.quarkus.example;

public class GreetingModel {
    private String greeting;

    public GreetingModel(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
