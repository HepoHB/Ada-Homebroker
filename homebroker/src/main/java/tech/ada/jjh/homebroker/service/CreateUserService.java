package tech.ada.jjh.homebroker.service;

import org.springframework.stereotype.Service;
import tech.ada.jjh.homebroker.model.AppUser;
import tech.ada.jjh.homebroker.repository.UserRepository;

@Service
public class CreateUserService {
    private final UserRepository userRepository;

    public CreateUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public AppUser createUser(AppUser appUser){
        return userRepository.save(appUser);
    }
}
