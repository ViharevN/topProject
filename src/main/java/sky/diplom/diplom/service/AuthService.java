package sky.diplom.diplom.service;

import sky.diplom.diplom.dto.RegisterReq;
import sky.diplom.diplom.dto.Role;

public interface AuthService {
    boolean login(String userName, String password);
    boolean register(RegisterReq registerReq, Role role);
}