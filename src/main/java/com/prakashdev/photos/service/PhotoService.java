package com.prakashdev.photos.service;

import com.prakashdev.photos.model.Photo;
import com.prakashdev.photos.repository.PhotosRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

  private final PhotosRepository photosRepository;

  public PhotoService(PhotosRepository photosRepository) {
    this.photosRepository = photosRepository;
  }

  public Iterable<Photo> get() {
    return photosRepository.findAll();
  }

  public Photo get(Integer id) {
    return photosRepository.findById(id).orElse(null);
  }

  public void remove(Integer id) {
    photosRepository.deleteById(id);
  }

  public Photo save(String fileName, String contentType, byte[] data) {
    Photo photo = new Photo();
    photo.setContentType(contentType);
    photo.setFileName(fileName);
    photo.setData(data);
    photosRepository.save(photo);
    return photo;
  }
}
