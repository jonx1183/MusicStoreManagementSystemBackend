package com.example.musicstoremanagementsystembackend.Repository;

import com.example.musicstoremanagementsystembackend.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, String> {
}
