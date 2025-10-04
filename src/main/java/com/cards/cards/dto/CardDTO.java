package com.cards.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDTO {
    private UUID id;
    private String front;
    private String back;
    private UUID deckId;
}
