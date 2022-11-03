package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {
	
	private RecoveryRoomRepository RecoveryRoomRepository;
	
	@Autowired
    public List<RecoveryRoom> getAll(){
        return null;
    }
	
	@Autowired
    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return null;
    }
    
	@Autowired
    public RecoveryRoomType getRecoveryRoomType(String typeName) {
        return null;
    }

    public RecoveryRoom save(RecoveryRoom p) throws DuplicatedRoomNameException {
        return null;       
    }

    
}
