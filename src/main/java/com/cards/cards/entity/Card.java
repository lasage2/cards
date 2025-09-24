package com.cards.cards.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cards")
public class Card {
    @Column(name = "uuid")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String front;
    private String back;

    @Column(name = "deck_id")
    private UUID deckId;

}
