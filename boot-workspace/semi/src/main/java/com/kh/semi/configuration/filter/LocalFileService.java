package com.kh.semi.configuration.filter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.semi.file.service.FileService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LocalFileService implements FileService {
	
	private final Path fileLocation;
	
	public LocalFileService() {
		this.fileLocation = Paths.get("uploads").toAbsolutePath().normalize();
	}
	
	
	@Override
	public String store(MultipartFile file) {
		
		// 이름바꾸기 ~ 생략
		String originalFileName = file.getOriginalFilename();
		Path targetLocation = this.fileLocation.resolve(originalFileName);
		
		try {
			Files.copy(file.getInputStream(), 
					   targetLocation,
					   StandardCopyOption.REPLACE_EXISTING);
			
			return "http://localhost/uploads/" + originalFileName;
		} catch (IOException e) {
			throw new RuntimeException("이상한파일");
		}
		
	}

	
}
