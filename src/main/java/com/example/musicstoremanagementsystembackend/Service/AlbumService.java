package com.example.musicstoremanagementsystembackend.Service;

import com.example.musicstoremanagementsystembackend.Model.Album;
import com.example.musicstoremanagementsystembackend.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlbumService {

  @Autowired
  AlbumRepository albumRepository;

  public List<Album> getAlbums(){
    return albumRepository.findAll();
  }

  public Album addAlbum(@RequestBody Album album){

    return albumRepository.save(album);
  }
}
