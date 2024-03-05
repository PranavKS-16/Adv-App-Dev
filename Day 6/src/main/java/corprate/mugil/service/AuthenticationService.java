package corprate.mugil.service;

import corprate.mugil.dto.request.ForgotPasswordRequest;
import corprate.mugil.dto.request.LoginRequest;
import corprate.mugil.dto.request.RegisterRequest;
import corprate.mugil.dto.response.ForgotPasswordResponse;
import corprate.mugil.dto.response.LoginResponse;
import corprate.mugil.dto.response.RegisterResponse;


public interface AuthenticationService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request);

}
