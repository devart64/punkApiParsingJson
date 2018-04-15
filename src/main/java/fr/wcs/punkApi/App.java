package fr.wcs.punkApi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class App
{
    public  static OkHttpClient client = new OkHttpClient();
    public static void main( String[] args ) throws IOException {

        String result = run("https://api.punkapi.com/v2/beers");
        System.out.println(result);


    }

    private static String run(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        return response.body().string();

    }
}
