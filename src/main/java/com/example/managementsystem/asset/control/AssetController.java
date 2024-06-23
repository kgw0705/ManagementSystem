package com.example.managementsystem.asset.control;

import com.example.managementsystem.asset.entity.Asset;
import com.example.managementsystem.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssetController {

    @Autowired
    private AssetService assetService;
    private Asset asset;

    //자산명세서 등록
    @PostMapping("/registerAsset")
    public Asset registerAsset(@RequestBody Asset asset) {
        return assetService.registerAsset(asset);
    }

//    자산명세서 조회
//    @GetMapping("/viewAsset")
//    public Asset viewAsset( int id, String type) {
//        return assetService.viewAsset(id ,type);
//    }

    //자산명세서 조회
    @GetMapping("viewAsset/{assetId}/{assetType}")
    public ResponseEntity<List<Asset>> getAssetsByIdAndType(@PathVariable int assetId, @PathVariable String assetType) {
        List<Asset> assets = assetService.getAssetsByIdAndType(assetId, assetType);
        if (!assets.isEmpty()) {
            return new ResponseEntity<>(assets, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
