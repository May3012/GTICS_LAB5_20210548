package com.example.lab5m.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "device")
public class Device {
    @Id
    @Column(name = "DeviceID", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "DeviceName")
    private String deviceName;

    @Size(max = 255)
    @Column(name = "DeviceType")
    private String deviceType;

    @Size(max = 255)
    @Column(name = "Model")
    private String model;

    @Size(max = 255)
    @Column(name = "SerialNumber")
    private String serialNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SiteID")
    private Site siteID;

}