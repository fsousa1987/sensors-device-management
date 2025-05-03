package com.francisco.sensors.device.management.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sensor {

	@AttributeOverride(name = "value", column = @Column(name = "id", columnDefinition = "BIGINT"))
	@Id
	private SensorId id;

	private String name;
	private String ip;
	private String location;
	private String protocol;
	private String model;
	private boolean enabled;

}

