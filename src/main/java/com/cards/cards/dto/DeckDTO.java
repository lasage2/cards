package com.cards.cards.dto;

import java.util.UUID;

public record DeckDTO (UUID id, String name, String description, UUID ownerId){

}
