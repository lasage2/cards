package com.cards.cards.dto;

import java.util.UUID;

public record CardDTO(UUID id,String front, String back, UUID deckId) {

}
