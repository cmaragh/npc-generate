package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NPCController {

//    private static final String template = "What's up, %s?!";
//    private final AtomicLong counter = new AtomicLong();

    //----- /greeting?name=Court
    @GetMapping("/npc")
    public NPC createNPC(@RequestParam(value="name", defaultValue="World") String name) {
//        return new NPC(counter.incrementAndGet(), String.format(template, name));
        return new NPC();
    }
}
