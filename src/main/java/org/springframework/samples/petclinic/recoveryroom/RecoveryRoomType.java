package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "recovery_room_type")

public class RecoveryRoomType extends RecoveryRoom {
    @Id
    private Integer id;

    @NotBlank
    @Min(5)
    @Max(50)
    private String name;
}
