package com.rentalx.rental;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Booking {
	@Id
	Long id;

}
