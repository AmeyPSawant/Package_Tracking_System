package com.pts.package_tracking_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class PackageService {
    @Autowired
    private PackageRepository packageRepository;

    public Package trackPackage(String trackingId) {
        return packageRepository.findByTrackingId(trackingId);
    }

    public Package updatePackageStatus(String trackingId, String status) {
        Package pkg = trackPackage(trackingId);
        pkg.setStatus(status);
        pkg.setLastUpdated(LocalDateTime.now());
        return packageRepository.save(pkg);
    }
}