package com.francisco.sensors.device.management.domain.model;

import io.hypersistence.tsid.TSID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sensor {

	private TSID id;
	private String name;
	private String ip;
	private String location;
	private String protocol;
	private String model;
	private boolean enabled;

}

