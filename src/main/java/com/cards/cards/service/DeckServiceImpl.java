package com.cards.cards.service;

import com.cards.cards.dto.DeckDTO;
import com.cards.cards.entity.Deck;
import com.cards.cards.mapper.DeckMapper;
import com.cards.cards.repository.DeckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeckServiceImpl implements DeckService{
    private final DeckRepository deckRepository;
    private final DeckMapper deckMapper;

    @Override
    public List<DeckDTO> getAllDecks() {
        return deckRepository.findAll().stream().map((deck) -> deckMapper.toDTO(deck)).toList();
    }

    @Override
    public DeckDTO getDeckById(UUID uuid) {
        Deck findDeck = deckRepository.findById(uuid).orElse(null);
        return deckMapper.toDTO(findDeck);
    }

    @Override
    public List<DeckDTO> getDecksByOwnerId(UUID uuid) {
        return deckRepository.findByOwnerId(uuid).stream().map((deck -> deckMapper.toDTO(deck))).toList();
    }

    @Override
    public DeckDTO createDeck(DeckDTO deckDTO) {
        Deck deck = deckRepository.save(deckMapper.toEntity(deckDTO));
        return deckMapper.toDTO(deck);
    }

    @Override
    public void deleteDeck(UUID uuid) {
        deckRepository.deleteById(uuid);
    }
}
