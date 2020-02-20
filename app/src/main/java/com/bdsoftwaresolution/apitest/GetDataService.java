package com.bdsoftwaresolution.apitest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetDataService {
    @POST("photos/")
    Call<List<BlogsModel>> getAllPhotos();
}
