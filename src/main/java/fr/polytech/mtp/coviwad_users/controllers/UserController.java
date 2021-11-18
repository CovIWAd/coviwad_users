package fr.polytech.mtp.coviwad_users.controllers;
import fr.polytech.mtp.coviwad_users.models.User;
import fr.polytech.mtp.coviwad_users.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RolesAllowed({"user","admin"})
    @GetMapping
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User get(@PathVariable String id) {
        if(!userRepository.findById(id).isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"User with ID "+id+" not found");
        }
        return userRepository.getById(id);
    }

    @RolesAllowed({"user", "admin"})
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public User update (@PathVariable String id, @RequestBody User user){

        if(id != null && user != null && userRepository.findById(id).isPresent()){
            if((user.getFirst_name() != null)
                    && (user.getFirst_name().equals(""))
                    && (user.getLast_name() != null)
                    && (user.getLast_name().equals(""))
            ){
                User existingUser = userRepository.getById(id);
                BeanUtils.copyProperties(user, existingUser, "id");
                return userRepository.saveAndFlush(existingUser);
            }else{
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Attributes cannot be null");

            }

        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Missing arguments  or User with ID "+id+" not found");

        }
    }

    @RolesAllowed("admin")
    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
    }

}
