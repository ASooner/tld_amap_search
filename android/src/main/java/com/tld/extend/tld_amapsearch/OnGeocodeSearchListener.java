package com.tld.extend.tld_amapsearch;

import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeResult;

public abstract class OnGeocodeSearchListener implements  GeocodeSearch.OnGeocodeSearchListener{
    @Override
    public void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i) {

    }

    @Override
    public abstract void onGeocodeSearched(GeocodeResult geocodeResult, int i) ;
}
