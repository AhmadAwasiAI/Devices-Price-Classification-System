package com.example.backend_device_price_predict_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getDeviceById(@PathVariable Long id) {
        return deviceService.getDeviceById(id);
    }

    @PostMapping
    public ResponseEntity<Device> addNewDevice(@RequestBody Device device) {
        return deviceService.addNewDevice(device);
    }

    @PostMapping("/predict/{deviceId}")
    public ResponseEntity<String> predictPrice(@PathVariable Long deviceId) {
        return deviceService.predictPrice(deviceId);
    }
        public void predictAndSave(Device device) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> entity = new HttpEntity<>(device.toJson(), headers);
        String url = "http://localhost:8080/predict";
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);

        // Save the predicted price to the device entity
    }
}
