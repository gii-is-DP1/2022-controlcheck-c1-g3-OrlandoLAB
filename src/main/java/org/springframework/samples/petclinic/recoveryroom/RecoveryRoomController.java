package org.springframework.samples.petclinic.recoveryroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RecoveryRoomController {
	private final RecoveryRoomService RecoveryRoomService;
	
	@Autowired
	public RecoveryRoomController(RecoveryRoomService clinicService) {
		this.RecoveryRoomService = clinicService;
	}
}
