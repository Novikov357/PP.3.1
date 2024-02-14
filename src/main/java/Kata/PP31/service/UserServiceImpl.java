package Kata.PP31.service;

import Kata.PP31.model.User;
import Kata.PP31.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

        @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public User getUser(long id) {
        return userRepository.getReferenceById(id);
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
