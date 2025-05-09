package com.francisco.sensors.device.management.api.client;

import com.francisco.sensors.device.management.api.model.SensorMonitoringOutput;
import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

	void enableMonitoring(TSID sensorId);
	void disableMonitoring(TSID sensorId);
	SensorMonitoringOutput getDetail(TSID sensorId);

}
