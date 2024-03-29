package epsi.fx.com.simplecalendarproject.ws;


import java.util.List;

import epsi.fx.com.simplecalendarproject.beans.Event;
import epsi.fx.com.simplecalendarproject.beans.Login;
import epsi.fx.com.simplecalendarproject.beans.User;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by fx on 28/10/2015.
 * List of all rest API that the app may use
 */
public interface WebService {

    @GET("/meetings")
    Call<List<Event>> listEvents();

    @POST("/meetings")
    Call<Void> insertEvent(@Body Event event);

    @POST("/users")
    Call<Void> register(@Body User u);

    @POST("/login")
    Call<Void> login(@Body Login u);


}
