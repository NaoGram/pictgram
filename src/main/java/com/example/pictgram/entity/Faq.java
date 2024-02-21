package com.example.pictgram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "faq")
@Data
public class Faq {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(nullable = false)
		private String title;

		@Column(nullable = false, length = 1000)
		private String content;

}
