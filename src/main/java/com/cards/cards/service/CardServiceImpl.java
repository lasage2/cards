package com.cards.cards.service;

import com.cards.cards.dto.CardDTO;
import com.cards.cards.entity.Card;
import com.cards.cards.mapper.CardMapper;
import com.cards.cards.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{
    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    @Override
    public List<CardDTO> getCardsByDeckId(UUID uuid) {
        return cardRepository.findByDeckId(uuid).stream().map((card -> cardMapper.toDTO(card))).toList();
    }

    @Override
    public CardDTO createCard(CardDTO cardDTO) {
        Card card = cardRepository.save(cardMapper.toEntity(cardDTO));

        return  cardMapper.toDTO(card);
    }

    @Override
    public void deleteCard(UUID uuid) {
        cardRepository.deleteById(uuid);
    }
}
