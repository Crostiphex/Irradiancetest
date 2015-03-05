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
                bgElement.setBackgroundColor(Color.rgb(gamma_correction(a), gamma_correction(a), gamma_correction(a)));
                right_button.setBackgroundColor(Color.rgb(gamma_correction(a), gamma_correction(a), gamma_correction(a)));
                left_button.setBackgroundColor(Color.rgb(gamma_correction(a), gamma_correction(a), gamma_correction(a)));


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

            bgElement.setBackgroundColor(Color.rgb(gamma_correction(a), gamma_correction(a), gamma_correction(a)));
            right_button.setBackgroundColor(Color.rgb(gamma_correction(a), gamma_correction(a), gamma_correction(a)));
            left_button.setBackgroundColor(Color.rgb(gamma_correction(a), gamma_correction(a), gamma_correction(a)));

//toast to show the time it takes to run the programs
            Toast toast = Toast.makeText(context,""+a, duration);
            toast.show();

        }
    });


    }


    public int gamma_correction (int initial_value){

        int[ ] correction ={0,9, 20, 28, 34, 39, 44, 48, 51, 55, 58, 61, 64, 67, 69, 72, 74, 76,
        79, 81, 83, 85, 87, 89, 91, 92, 94, 96, 98, 99, 101, 102, 104, 105,
        107, 108, 110, 111, 113, 114, 115, 117, 118, 119, 121, 122, 123, 124,
        125, 127, 128, 129, 130, 131, 132, 133, 134, 135, 137, 138, 139, 140,
        141, 142, 143, 144, 145, 146, 147, 147, 148, 149, 150, 151, 152, 153,
        154, 155, 156, 157, 157, 158, 159, 160, 161, 162, 162, 163, 164, 165,
        166, 166, 167, 168, 169, 170, 170, 171, 172, 173, 173, 174, 175, 176,
        176, 177, 178, 179, 179, 180, 181, 181, 182, 183, 183, 184, 185, 185,
        186, 187, 187, 188, 189, 189, 190, 191, 191, 192, 193, 193, 194, 195,
        195, 196, 196, 197, 198, 198, 199, 200, 200, 201, 201, 202, 203, 203,
        204, 204, 205, 205, 206, 207, 207, 208, 208, 209, 209, 210, 211, 211,
        212, 212, 213, 213, 214, 214, 215, 215, 216, 217, 217, 218, 218, 219,
        219, 220, 220, 221, 221, 222, 222, 223, 223, 224, 224, 225, 225, 226,
        226, 227, 227, 228, 228, 229, 229, 230, 230, 231, 231, 232, 232, 233,
        233, 234, 234, 235, 235, 236, 236, 236, 237, 237, 238, 238, 239, 239,
        240, 240, 241, 241, 242, 242, 242, 243, 243, 244, 244, 245, 245, 246,
        246, 246, 247, 247, 248, 248, 249, 249, 249, 250, 250, 251, 251, 252,
        252, 252, 253, 253, 254, 254, 255, 255, 255, 255, 255, 255,255};


return correction[initial_value];

}

}

