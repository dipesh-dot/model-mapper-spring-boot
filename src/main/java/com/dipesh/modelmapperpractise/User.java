package com.dipesh.modelmapperpractise;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "User")
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "user_tb_seq_gen")
        @SequenceGenerator(name = "user_tb_seq_gen",sequenceName = "user_tb_seq",allocationSize = 1)
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
}
