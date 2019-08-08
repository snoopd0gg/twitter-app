package com.dbs.twitter.model;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class User {
    @Id
    @Setter
    private long id;
    private String name;
    private String password;
}
