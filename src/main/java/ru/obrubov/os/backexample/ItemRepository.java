package ru.obrubov.os.backexample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author mobrubov
 * Created on 22.11.2020
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
