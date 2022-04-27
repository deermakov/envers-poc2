package ru.lanit.research.envers.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Полученная сущность
 */
@Entity
@DiscriminatorValue("INDIVIDUAL")
@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class Individual extends Party {
    private String fio;
}
