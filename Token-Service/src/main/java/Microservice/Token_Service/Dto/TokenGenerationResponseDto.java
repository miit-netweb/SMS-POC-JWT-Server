package Microservice.Token_Service.Dto;

import java.time.LocalDateTime;

public class TokenGenerationResponseDto {

    private String token;
    private LocalDateTime expiry;

    public TokenGenerationResponseDto() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }
}
