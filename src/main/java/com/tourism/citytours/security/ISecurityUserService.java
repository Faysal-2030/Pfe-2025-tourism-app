package com.tourism.citytours.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
