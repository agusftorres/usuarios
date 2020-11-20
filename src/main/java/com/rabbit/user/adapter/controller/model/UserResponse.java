package com.rabbit.user.adapter.controller.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.rabbit.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String cuit;
    private String email;
    private String password;
    private String name;

    public static UserResponse toDomain(User user){
        return UserResponse.builder()
                .cuit(user.getCuit())
                .email(user.getEmail())
                .name(user.getName())
                .id(user.getId()).build();
    }

    public static List<UserResponse> toListDomain(List<User> usersDomain) {
        return usersDomain
                .stream()
                .map(UserResponse::toDomain)
                .collect(Collectors.toList());
    }
}
