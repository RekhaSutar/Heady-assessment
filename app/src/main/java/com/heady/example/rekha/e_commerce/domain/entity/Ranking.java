
package com.heady.example.rekha.e_commerce.domain.entity;

import java.util.List;
import com.squareup.moshi.Json;

public class Ranking {

    @Json(name = "ranking")
    public String ranking;
    @Json(name = "products")
    public List<Product_> products = null;

}
