package com.cards.cards.controller;

import com.cards.cards.dto.DeckDTO;
import com.cards.cards.service.CardService;
import com.cards.cards.service.DeckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/decks")
@RequiredArgsConstructor
public class DeckController {
    private final DeckService deckService;
    private final CardService cardService;

    @GetMapping
    List<DeckDTO> getAllDecks(){
        return deckService.getAllDecks();
    }

    @GetMapping("/{id}")
    DeckDTO getDeckById(@PathVariable UUID id) {
        return deckService.getDeckById(id);
    }

    @GetMapping
    List<DeckDTO> getDecksByOwnerId(@RequestParam UUID ownerId){
        return deckService.getDecksByOwnerId(ownerId);
    }

    @PostMapping
    DeckDTO createDeck (@RequestBody DeckDTO deckDTO){
        return deckService.createDeck(deckDTO);
    }

    @PostMapping("/{id}")
    void deleteDeck(@PathVariable UUID id){
        deckService.deleteDeck(id);
    }
}
