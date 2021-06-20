package core;

import entities.concretes.User;

public interface ValidationService {
    void send(User user);
    boolean verify(User user);
}
