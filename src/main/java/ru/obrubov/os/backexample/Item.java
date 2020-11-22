package ru.obrubov.os.backexample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author mobrubov
 * Created on 22.11.2020
 */
@Data
@Table
@Entity
public class Item {
    @Id
    private Long id;
    private String code;
}
