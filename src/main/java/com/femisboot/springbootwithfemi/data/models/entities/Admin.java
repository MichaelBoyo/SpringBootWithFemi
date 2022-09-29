package com.femisboot.springbootwithfemi.data.models.entities;

import com.femisboot.springbootwithfemi.data.models.enums.Authority;
import com.femisboot.springbootwithfemi.data.models.baseModel.LumExpressUser;
import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends LumExpressUser {
    @Id
    private Long id;
    @ElementCollection
    private Set<Authority> authorities;
}
