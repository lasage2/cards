package com.cards.cards.mapper;

import com.cards.cards.dto.DeckDTO;
import com.cards.cards.entity.Deck;

@org.mapstruct.Mapper(componentModel = "spring")
public interface DeckMapper {
    DeckDTO toDTO (Deck deck);
}
