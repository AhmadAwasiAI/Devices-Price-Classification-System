package com.example.backend_device_price_predict_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeviceService {

    private final RestTemplate restTemplate;
    private final DeviceRepository deviceRepository;

    public DeviceService(RestTemplateBuilder restTemplateBuilder, DeviceRepository deviceRepository) {
        this.restTemplate = restTemplateBuilder.build();
        this.deviceRepository = deviceRepository;
    }

    // Implement service methods here
    // Example:
    public Device getDeviceById(Long id) {
        return deviceRepository.findById(id).orElse(null);
    }

    public Device addNewDevice(Device device) {
        return deviceRepository.save(device);
    }

    public String predictPrice(Long deviceId) {
        // Assuming the Python API returns a string prediction
        String predictionUrl = "http://localhost:5000/predict?deviceId=" + deviceId;
        return restTemplate.getForObject(predictionUrl, String.class);
    }
}
