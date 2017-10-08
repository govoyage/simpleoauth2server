package com.lanka_guide.simpleoauth2server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloOAuthController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/helloOAuth")
    public HelloOAuth greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new HelloOAuth(counter.incrementAndGet(),
                String.format(template, name));
    }
}
