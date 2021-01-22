package pl.camp.it.rest.provider.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.camp.it.rest.provider.ProcesorDanych;
import pl.camp.it.rest.provider.model.Address;
import pl.camp.it.rest.provider.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        Address address = new Address();
        address.setCountry("Polska");
        address.setCity("Kraków");
        address.setStreet("Ogrodowa");
        address.setBuildingNo("15a");
        address.setApartmentNo(10);
        address.setPostCode("31-657");

        User user = new User();
        user.setAddress(address);
        user.setName("Mateusz");
        user.setSurname("Bereda");
        user.setAge(30);
        user.setId(1);
        user.setLogin("admin");

        return user;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        System.out.println(user);
        user.setId(1);
        user.setLogin(user.getLogin()+"10");
        return user;
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public void putUser(@RequestBody int a) {
        System.out.println(a);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestHeader("jakis-header") String cos, @RequestHeader("inny-header") String cos2) {
        System.out.println(cos);
        System.out.println(cos2);
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        List<User> result = new ArrayList<>();

        Address address = new Address();
        address.setCountry("Polska");
        address.setCity("Kraków");
        address.setStreet("Ogrodowa");
        address.setBuildingNo("15a");
        address.setApartmentNo(10);
        address.setPostCode("31-657");

        User user = new User();
        user.setAddress(address);
        user.setName("Mateusz");
        user.setSurname("Bereda");
        user.setAge(30);
        user.setId(1);
        user.setLogin("admin");

        result.add(user);

        Address address2 = new Address();
        address2.setCountry("Polska");
        address2.setCity("Poznań");
        address2.setStreet("Ogrodowa");
        address2.setBuildingNo("15a");
        address2.setApartmentNo(10);;
        address2.setPostCode("31-657");

        User user2 = new User();
        user2.setAddress(address2);
        user2.setName("Karol");
        user2.setSurname("Kowalski");
        user2.setAge(30);
        user2.setId(1);
        user2.setLogin("karol");

        result.add(user2);

        Address address3 = new Address();
        address2.setCountry("Polska");
        address2.setCity("Gdynia");
        address2.setStreet("Piekna");
        address2.setBuildingNo("40");
        address2.setApartmentNo(15);;
        address2.setPostCode("31-657");

        User user3 = new User();
        user3.setAddress(address3);
        user3.setName("Jan");
        user3.setSurname("Malinowski");
        user3.setAge(30);
        user3.setId(1);
        user3.setLogin("janek");

        result.add(user3);

        return result;
    }

    @RequestMapping(value = "/startProcessing", method = RequestMethod.GET)
    public void startProcessing() {
        new Thread(new ProcesorDanych()).start();
    }

    @RequestMapping(value = "/costam", method = RequestMethod.POST)
    public ResponseEntity<User> cosTam(@RequestBody double a) {
        if(a > 10.05) {
            return ResponseEntity.status(400).build();
        } else {
            return ResponseEntity.ok().body(
                    new User(1, "Mateusz", "Bereda", null, "mateusz", 30));
        }
    }
}
