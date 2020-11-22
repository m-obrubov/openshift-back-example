package ru.obrubov.os.backexample;

import javax.persistence.*;

import lombok.Data;

/**
 * @author mobrubov
 * Created on 22.11.2020
 */
@Data
@Table
@Entity
public class Item {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String code;
}
