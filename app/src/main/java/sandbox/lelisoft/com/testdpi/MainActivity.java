package sandbox.lelisoft.com.testdpi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inScaled = false;
//        opt.inMutable = true;
        Bitmap figureBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_test, opt);
        ImageView imageView=(ImageView) findViewById(R.id.testView);
        imageView.setImageBitmap(figureBitmap);
    }

    /*
        Nexus 5x - both xxhdpi; if I delete xxhdpi variant, xxxhdpi is used
        Samsung Galaxy SIII Mini - both use hdpi; if I delete hdpi variant, xhdpi is used
     */
}
