package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecoveryRoomRepository extends CrudRepository <RecoveryRoom, Integer>{
	
	
    List<RecoveryRoom> findAll();
    Optional<RecoveryRoom> findById(int id);
    RecoveryRoom save(RecoveryRoom p);
    List<RecoveryRoomType> findAllRecoveryRoomTypes();
    
	@Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
    RecoveryRoomType getRecoveryRoomType(String name);
}
