
package com.heady.example.rekha.e_commerce.domain.entity;

import java.util.List;
import com.squareup.moshi.Json;

public class Data {

    @Json(name = "categories")
    public List<Category> categories = null;
    @Json(name = "rankings")
    public List<Ranking> rankings = null;

}
