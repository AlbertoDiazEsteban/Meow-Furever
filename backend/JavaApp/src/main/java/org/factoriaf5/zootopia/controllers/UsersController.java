package org.factoriaf5.zootopia.controllers;


import org.factoriaf5.zootopia.models.users.Users;
import org.factoriaf5.zootopia.services.UsersService;
import org.factoriaf5.zootopia.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired
  private UsersService usersService;

  @GetMapping
  public ArrayList<Users> getUsers() {
    return this.usersService.getUsers();
  }

  @PostMapping
  public Users saveUser(@RequestBody Users user) {
    return this.usersService.saveUser(user);
  }

  @GetMapping(path = "/{id}")
  public Optional<Users> getUserById(@PathVariable Long id) {
    return this.usersService.getById(id);
  }

  @PutMapping(path = "/{id}")
  public Users updateUserById(@RequestBody Users request, @PathVariable("id") Long id) {
    return this.usersService.updateById(request, id);
  }

  @DeleteMapping(path = "/{id}")
  public String deleteById(@PathVariable("id") Long id) {
    boolean ok = this.usersService.deleteUser(id);

    if (ok) {
      return "User with id " + id + " deleted";
    } else {
      return "Error, we have a problem and cant deliver" + id + "que te follen";
    }
  }

}