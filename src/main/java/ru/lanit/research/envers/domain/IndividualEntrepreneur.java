package ru.lanit.research.envers.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("INDIVIDUAL_ENTREPRENEUR")
@Audited
@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class IndividualEntrepreneur extends LegalEntity {
    @OneToOne
    @JoinColumn(name = "individual_id")
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private Individual individual;

    private Boolean selfEmployed;
}
