package com.example.musicstoremanagementsystembackend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String street;
  private String city;
  private int zip;


  @OneToMany(mappedBy = "store")
  @JsonBackReference
  private Set<Album> albums = new HashSet<>();

  public Set<Album> getAlbums() {
    return albums;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public int getZip() {
    return zip;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public void setAlbums(Set<Album> albums) {
    this.albums = albums;
  }
}
