package androidgig.com.fontfamilydatabinding;

import android.app.Application;
import android.content.Context;

public class CustomApplication extends Application
{
    private static Context context;
    CustomFontFamily customFontFamily;
    @Override
    public void onCreate() {
        super.onCreate();
        CustomApplication.context=this;
        customFontFamily=CustomFontFamily.getInstance();
        customFontFamily.addFont("amatic","AmaticSC-Regular.ttf");
        customFontFamily.addFont("pacific","Pacifico.ttf");
        customFontFamily.addFont("seasrn","SEASRN.ttf");
        customFontFamily.addFont("capture","Capture_it.ttf");
        customFontFamily.addFont("xcelsion","Xcelsion_Italic.ttf");

    }
    public static Context getContext() {
        return context;
    }
}
