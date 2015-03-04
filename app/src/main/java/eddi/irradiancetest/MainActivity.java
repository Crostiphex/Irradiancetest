package eddi.irradiancetest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
    int a = 0;


@Override
    protected void onCreate(Bundle work) {
        super.onCreate(work);
        setContentView(R.layout.activity_main);

        final Button left_button = (Button) findViewById(R.id.left_button);
    final Button right_button = (Button) findViewById(R.id.right_button);

        left_button.setOnClickListener(new View.OnClickListener() {

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            public void onClick(View v) {
                // Perform action on click
                RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.greyLayout);
                a=a-17;
bgElement.setBackgroundColor(Color.rgb(a, a, a));
                right_button.setBackgroundColor(Color.rgb(a,a,a));
                left_button.setBackgroundColor(Color.rgb(a,a,a));


//toast to show the time it takes to run the programs
                Toast toast = Toast.makeText(context,""+a, duration);
                toast.show();

            }
        });

   right_button.setOnClickListener(new View.OnClickListener() {
                Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        public void onClick(View v) {
            // Perform action on click
            RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.greyLayout);
            a=a+17;
            bgElement.setBackgroundColor(Color.rgb(a,a,a));
            right_button.setBackgroundColor(Color.rgb(a,a,a));
            left_button.setBackgroundColor(Color.rgb(a,a,a));

//toast to show the time it takes to run the programs
            Toast toast = Toast.makeText(context,""+a, duration);
            toast.show();

        }
    });
    }
}

