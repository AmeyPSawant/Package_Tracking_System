package com.pts.package_tracking_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/packages")
public class PackageController {
    @Autowired
    private PackageService packageService;

    @GetMapping("/{trackingId}")
    public Package trackPackage(@PathVariable String trackingId) {
        return packageService.trackPackage(trackingId);
    }

    @PutMapping("/{trackingId}/status")
    public Package updateStatus(@PathVariable String trackingId, @RequestParam String status) {
        return packageService.updatePackageStatus(trackingId, status);
    }
}