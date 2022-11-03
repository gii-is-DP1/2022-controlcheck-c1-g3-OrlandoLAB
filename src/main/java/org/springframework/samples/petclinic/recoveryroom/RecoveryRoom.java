package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "recovery_room")
public class RecoveryRoom {

    @Id
    private Integer id;

    @NotBlank
    @Min(3)
    @Max(50)
    private String name;

    @PositiveOrZero
    private Double size;

    @NotEmpty
    private Boolean secure;
    @Transient
    RecoveryRoomType roomType;
}