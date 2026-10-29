package com.pm.patientservice.kafka;

import com.pm.patientservice.model.Patient;
import events.PatientEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducer {

    private final KafkaTemplate<Object, byte[]> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<Object, byte[]> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(Patient patient) {
        PatientEvent event = PatientEvent.newBuilder()
                .setPatientId(patient.getId().toString())
                .setName(patient.getName())
                .setEmail(patient.getEmail())
                .setEventType("PATIENT_CREATED")
                .build();

        try {
            kafkaTemplate.send("patient", event.toByteArray());
        }catch (Exception e){
            log.error("Error sending patient created: {}", e.getMessage());
        }
    }
}
