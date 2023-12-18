package kz.iitu.lab2.entity;

import javax.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Data
@Table(name = "roles")
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}