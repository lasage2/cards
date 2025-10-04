package com.cards.cards.repository;

import com.cards.cards.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DeckRepository extends JpaRepository<Deck, UUID> {
    List<Deck> findByOwnerId(UUID uuid);
}
