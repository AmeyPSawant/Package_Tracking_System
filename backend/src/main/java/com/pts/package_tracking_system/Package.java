package com.pts.package_tracking_system;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "packages") // Map to the "packages" table in Supabase
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracking_id")
    private String trackingId;

    private String sender;
    private String receiver;
    private String status;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    // Default Constructor (required by JPA)
    public Package() {
    }

    // Parameterized Constructor
    public Package(String trackingId, String sender, String receiver, String status, LocalDateTime lastUpdated) {
        this.trackingId = trackingId;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // toString() Method (optional, for debugging purposes)
    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", trackingId='" + trackingId + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", status='" + status + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
