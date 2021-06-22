package com.ds.sarebibirth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Present {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pid;
	@NotBlank(message = "名稱請勿空白")
	private String pname;
	private String brand;
	@NotNull(message = "價值請勿空白")
	private Integer price;
	private String pic;
	private String adress;
}
