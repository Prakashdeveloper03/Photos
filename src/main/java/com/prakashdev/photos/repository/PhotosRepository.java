package com.prakashdev.photos.repository;

import com.prakashdev.photos.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
}