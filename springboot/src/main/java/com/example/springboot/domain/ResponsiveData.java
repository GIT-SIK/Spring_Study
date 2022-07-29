package com.example.springboot.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="responsive_data")
public class ResponsiveData {
    @Id
    @Column(name = "idx")
    private int idx;
}
