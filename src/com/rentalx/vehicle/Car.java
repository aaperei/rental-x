package com.rentalx.vehicle;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Car {
	@Id
	Long id;
	@OneToMany
	private List<Traffic> trafficList;
	@OneToMany
	private List<Maintenance> maintenanceList;
	@OneToMany
	private List<CarDocument> carDocumentList;
	
}
