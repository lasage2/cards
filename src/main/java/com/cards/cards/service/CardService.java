package com.cards.cards.service;

import com.cards.cards.dto.CardDTO;
import com.cards.cards.entity.Card;

import java.util.List;
import java.util.UUID;

public interface CardService {
    List<CardDTO> getCardsByDeckId(UUID uuid);
    CardDTO createCard(CardDTO cardDTO);
    void deleteCard(UUID uuid);
}
