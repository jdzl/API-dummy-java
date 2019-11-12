package hello.controller;

import hello.Models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(path = "/demo")
public class HelloController {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi() {
        return "Hello";
    }

    @RequestMapping(value = "/account/{acc}/validate",method = RequestMethod.GET)
    public String accValidate(@PathVariable String acc) {
        return "Hello"+ acc;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "API usuarios :: working from Spring Boot!";
    }

    @RequestMapping(value = "/convert/{message}",method = RequestMethod.GET)
    public String cv(@PathVariable String message) {

       return  message.replace('a','4')
                .replace('e','3')
                .replace('i','1')
                .replace('o','0');


    }

    @RequestMapping("/newDummy" )
    public List<Usuario> getUsr() {

        Random rnd = new Random();

       return   Arrays.asList(
               new Usuario("Alice", "Smith" + rnd.nextInt()) ,
               new Usuario("Bob",   "Smith" + rnd.nextInt())
                );
    }


    
}
