
package ru.ignatovichanastasiia.alfa.domein;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author ignatovichanastasiia
 */
public class Gif {
    String type;
    String id;
    String slug;
    String url;
    @SerializedName("bitly_url")
    String bitlyUrl;
    @SerializedName("embed_url")
    String embedUrl;
    String username;
    String sourse;
    String rating;
    
    
    
    

    
}
