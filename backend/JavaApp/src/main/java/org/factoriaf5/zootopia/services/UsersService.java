package org.factoriaf5.zootopia.services;

import org.factoriaf5.zootopia.models.users.Users;
import org.factoriaf5.zootopia.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public ArrayList<Users> getUsers() {
        return (ArrayList<Users>) usersRepository.findAll();
    }

    public Users saveUser(Users users) {
        return usersRepository.save(users);
    }

    public Optional<Users> getById(Long id) {
        return usersRepository.findById(id);
    }


    public Users updateById(Users request, Long id) {
        if (usersRepository.existsById(id)) {
            Users user = usersRepository.findById(id).get();
            user.setUsername(request.getUsername());
            user.setPassword(request.getPassword());
            return usersRepository.save(user);
        } else {
            throw new RuntimeException("User not found with id: " + id);
        }
    }


    public Boolean deleteUser(Long id) {
        try {
            usersRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario con ID: " + id);
            e.printStackTrace();
            return false;
        }
    }

}
