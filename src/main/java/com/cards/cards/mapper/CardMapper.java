package com.cards.cards.mapper;

import com.cards.cards.dto.CardDTO;
import com.cards.cards.entity.Card;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CardMapper {
    CardDTO toDTO (Card card);
    Card toEntity(CardDTO cardDTO);
}
