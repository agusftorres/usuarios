package com.rabbit.user.domain;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class Login {
    UUID id;
    String message;
}
