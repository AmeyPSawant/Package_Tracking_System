package com.pts.package_tracking_system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
    Package findByTrackingId(String trackingId);
}