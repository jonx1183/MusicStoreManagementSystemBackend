package com.example.musicstoremanagementsystembackend.Model;

import jakarta.persistence.*;

@Entity
public class Album {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String artist;
  private String genre;
  private boolean availability;

  @ManyToOne
  @JoinColumn(name = "store", referencedColumnName = "id")
  private Store store;

  public Store getStore() {
    return store;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getGenre() {
    return genre;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }
}
