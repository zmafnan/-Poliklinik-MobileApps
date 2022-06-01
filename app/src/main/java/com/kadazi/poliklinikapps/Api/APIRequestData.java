package com.kadazi.poliklinikapps.Api;

import com.kadazi.poliklinikapps.Model.ResponseModel;
import com.kadazi.poliklinikapps.Model.ResponseModelResep;
import com.kadazi.poliklinikapps.Model.ResponseModelRiwayat;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface APIRequestData {
    @GET("resep")
    Call<ResponseModelResep> listResep();


    @FormUrlEncoded
    @POST("auth")
    Call<ResponseModel> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("riwayat_pemeriksaan/{id}")
    Call<ResponseModelRiwayat> listRiwayat(@Path("id") int id);

}
