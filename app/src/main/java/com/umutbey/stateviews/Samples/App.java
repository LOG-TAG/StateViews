package com.umutbey.stateviews.Samples;

import android.app.Application;
import android.graphics.Color;

import com.umutbey.stateviews.StateViewsBuilder;

import androidx.appcompat.content.res.AppCompatResources;

/**
 * Created by medyo on 11/20/17.
 * Developed by kobeumut on 11/04/18
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        StateViewsBuilder.Companion
                .init()
                .setState("error",
                        "No Connection",
                        "Error retrieving information from server.",
                        AppCompatResources.getDrawable(this, R.drawable.ic_server_error),
                        Color.RED,
                        "Retry", null
                )

                .setState(
                        "archive",
                        "Clear the clutter",
                        "Archived items will be kept here. They'll still show in albums " +
                                "& search results.",
                        AppCompatResources.getDrawable(this, R.drawable.photos_archive),
                        Color.BLUE,
                        "LEARN MORE", null
                )

                .setState("search",
                        "No Results Found",
                        "Unfortunately I could not find any results matching your search",
                        AppCompatResources.getDrawable(this, R.drawable.search), null, null, null)
                .setState("custom",
                        "Custom State",
                        "This is a custom state, made in 5 seconds \nClick to hide status ",
                        AppCompatResources.getDrawable(this, R.drawable.caution),
                        null,
                        "HIDE STATE", null)
                .setButtonBackgroundColor(Color.parseColor("#317DED"))
                .setButtonTextColor(Color.parseColor("#FFFFFF"))
                .setIconSize(getResources().getDimensionPixelSize(R.dimen.state_views_icon_size));

        StateViewsBuilder.Companion
                .init()
                .setState("custom",
                        "Custom 1 State",
                        "This is a 1 custom state, made in 5 seconds \nClick to hide status ",
                        AppCompatResources.getDrawable(this, R.drawable.caution),
                        null,
                        "HIDE STATE", null)
                .setButtonBackgroundColor(Color.parseColor("#317DED"))
                .setButtonTextColor(Color.parseColor("#FFFFFF"))
                .setIconSize(getResources().getDimensionPixelSize(R.dimen.state_views_icon_size));
    }


}
