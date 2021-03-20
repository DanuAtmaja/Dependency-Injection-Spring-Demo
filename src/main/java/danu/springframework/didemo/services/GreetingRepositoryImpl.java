package danu.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getIndonesianGreeting() {
        return "Hallo - Salam Jasa Primary";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Gruß Primary";
    }
}
