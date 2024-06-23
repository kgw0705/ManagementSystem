package com.example.managementsystem.Asset.repository;

import com.example.managementsystem.Asset.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {

    @Query("SELECT a FROM Asset a WHERE a.asset_id = :assetId AND a.asset_type = :assetType")
    List<Asset> findByAssetIdAndAssetType(@Param("assetId") int assetId, @Param("assetType") String assetType);

}
