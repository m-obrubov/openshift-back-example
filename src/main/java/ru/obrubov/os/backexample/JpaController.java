package ru.obrubov.os.backexample;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author mobrubov
 * Created on 22.11.2020
 */
@RequiredArgsConstructor
@RequestMapping("/items")
@RestController
public class JpaController {
    private final ItemRepository itemRepository;

    @GetMapping
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Long addItem(@RequestParam String code) {
        var item = new Item();
        item.setCode(code);
        Item saved = itemRepository.save(item);
        return saved.getId();
    }
}
