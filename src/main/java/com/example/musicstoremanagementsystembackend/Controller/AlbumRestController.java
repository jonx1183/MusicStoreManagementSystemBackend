package com.example.musicstoremanagementsystembackend.Controller;

import com.example.musicstoremanagementsystembackend.Model.Album;
import com.example.musicstoremanagementsystembackend.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumRestController {

  @Autowired
  AlbumService albumService;

  @GetMapping("/albums")
  public List<Album> getAlbums(){
    return albumService.getAlbums();
  }

  @PostMapping("/addAlbum")
  @ResponseStatus(HttpStatus.CREATED)
  public Album addAlbum(@RequestBody Album album){
    return albumService.addAlbum(album);
  }
}
