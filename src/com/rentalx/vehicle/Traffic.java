package com.rentalx.vehicle;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Traffic {
	@Id
	Long id;
	private Date date;
	private int km;
}
