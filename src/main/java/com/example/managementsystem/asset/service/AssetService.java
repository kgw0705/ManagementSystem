package com.example.managementsystem.asset.service;

import com.example.managementsystem.asset.entity.Asset;
import com.example.managementsystem.asset.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    @Autowired
    private AssetRepository assetRepository;


    public Asset registerAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    public Asset viewAsset(int id, String type) {
        return assetRepository.findById(id).orElse(null);
    }

    public List<Asset> getAssetsByIdAndType(int assetId, String assetType) {
        return assetRepository.findByAssetIdAndAssetType(assetId, assetType);


    }


}