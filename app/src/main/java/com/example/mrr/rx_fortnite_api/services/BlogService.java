package com.example.mrr.rx_fortnite_api.services;

import com.example.mrr.rx_fortnite_api.Utils.FortniteApiConstants;
import com.example.mrr.rx_fortnite_api.models.blogs.BlogHolder;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BlogService {

    @GET(FortniteApiConstants.BLOG_URL)
    Single<BlogHolder> getBlogs(
                        @Query("category") String category,
                        @Query("postsPerPage") String postsPerPage,
                        @Query("offset") String offset,
                        @Query("locale") String locale
    );
}
