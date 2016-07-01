package com.rentalx.vehicle;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CarDocument {
	@Id
	Long id;
	private String licencePlate;
	private String model;
	private String brand;
	private Integer carYear;
	private Integer docYear;
	
	
}
