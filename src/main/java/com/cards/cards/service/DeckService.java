package com.cards.cards.service;

import com.cards.cards.dto.DeckDTO;
import com.cards.cards.entity.Deck;

import java.util.List;
import java.util.UUID;

public interface DeckService {
    List<DeckDTO> getAllDecks();
    DeckDTO getDeckById(UUID uuid);
    List<DeckDTO> getDecksByOwnerId(UUID uuid);
    DeckDTO createDeck(DeckDTO deckDTO);
    void deleteDeck(UUID uuid);
}
