package danu.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_DANU = "Hello Danu - Original";

    @Override
    public String sayGreeting() {
        return HELLO_DANU;
    }

}
