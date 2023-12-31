package com.sangam.project.initializer;

import com.sangam.project.service.FileUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppInitializer implements CommandLineRunner {

    private final FileUploadService fileUploadService;

    @Override
    public void run(String... args) {
        fileUploadService.uploadFileToS3Bucket();
    }
}
