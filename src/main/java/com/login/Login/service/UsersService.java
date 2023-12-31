package com.login.Login.service;

import com.login.Login.request.dto.LoginDto;
import com.login.Login.request.dto.RegisterDto;

public interface UsersService  {

    void saveUser(RegisterDto registerDto);

    public boolean existsByNameIgnoreCase(String name);
    public boolean existsByEmailIgnoreCase(String email);
    public void verifyAccount(String email);
    public boolean login(LoginDto loginDto);
    public boolean isActive(String name);
    public String getActiveStatus(String username);

    public void generateOtp(String username);
    public boolean checkTimeLimit(String otp, String username);
    public void recreatePassword(String username,String password,String otp);
    public void deActivateAccount(String username);


}
