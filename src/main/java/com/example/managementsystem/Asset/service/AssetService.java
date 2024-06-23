package com.example.managementsystem.Asset.service;

import com.example.managementsystem.Asset.entity.Asset;
import com.example.managementsystem.Asset.repository.AssetRepository;
import com.example.managementsystem.accountingcontrol.entity.CardUsage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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