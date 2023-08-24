package com.example.musicstoremanagementsystembackend.Model.Config;

import com.example.musicstoremanagementsystembackend.Model.Album;
import com.example.musicstoremanagementsystembackend.Model.Store;
import com.example.musicstoremanagementsystembackend.Repository.AlbumRepository;
import com.example.musicstoremanagementsystembackend.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  StoreRepository storeRepository;

  @Autowired
  AlbumRepository albumRepository;



  public void run(String... args)throws Exception{
    Store store1 = new Store();
    store1.setName("Store1");
    store1.setStreet("Street1");
    store1.setCity("City1");
    store1.setZip(1111);
    storeRepository.save(store1);

    Album album1 = new Album();
    album1.setTitle("Title1");
    album1.setArtist("Artist1");
    album1.setGenre("Genre1");
    album1.setAvailability(true);
    album1.setStore(store1);
    albumRepository.save(album1);
  }
}
