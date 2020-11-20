package com.rabbit.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1234567891011121314L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String cuit;
    private String email;
    private String password;
    private String name;
}
