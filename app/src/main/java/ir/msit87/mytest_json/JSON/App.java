package ir.msit87.mytest_json.JSON;

import android.app.Application;
import android.content.Context;

import ir.msit87.mytest_json.JSON.view.activity.MainActivity;

/**
 * Created by MSIT on 9/24/2017.
 */

public class App extends Application {

    private static Context context;

    public static Context getContext(){
        return MainActivity.context;
    }
}
