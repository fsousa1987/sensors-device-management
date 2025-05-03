package com.francisco.sensors.device.management.domain.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class SensorId implements Serializable {

	private TSID value;

	public SensorId(TSID value) {
		Objects.requireNonNull(value);
		this.value = value;
	}

	public SensorId(String value) {
		Objects.requireNonNull(value);
		this.value = TSID.from(value);
	}

	public SensorId(Long value) {
		Objects.requireNonNull(value);
		this.value = TSID.from(value);
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;

		SensorId sensorId = (SensorId) o;
		return value.equals(sensorId.value);
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

}
