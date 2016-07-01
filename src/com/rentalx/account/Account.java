package com.rentalx.account;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity	
@Inheritance (strategy = InheritanceType.JOINED)
@Data
public  abstract class Account {
	@Id
	private Long id;
	private String name;
	@OneToOne
	private ContactInfo contactInfo;
}
