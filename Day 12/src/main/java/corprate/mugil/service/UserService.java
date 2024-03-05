package corprate.mugil.service;

import java.util.List;

import corprate.mugil.model.User;
import corprate.mugil.dto.request.RegisterRequest;
import corprate.mugil.dto.response.RegisterResponse;
import corprate.mugil.dto.response.UserDetailResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest request);

    UserDetailResponse getUser(String email);

    List<User> getAllUser();
}
