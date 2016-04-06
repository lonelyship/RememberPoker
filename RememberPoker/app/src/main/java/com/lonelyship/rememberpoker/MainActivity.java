package com.lonelyship.rememberpoker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button      btn_start   = null;
    ImageView   iv_next     = null;
    ImageView   iv_previous = null;
    ImageView   iv_1        = null;
    ImageView   iv_2        = null;
    TextView    tv_page     = null;

    int index = 0;

    private int al_card[] = new int[52];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        btn_start = (Button) findViewById(R.id.btn_start);
        iv_next = (ImageView) findViewById(R.id.iv_next);
        iv_previous = (ImageView) findViewById(R.id.iv_previous);
        iv_1 = (ImageView) findViewById(R.id.iv_1);
        iv_2 = (ImageView) findViewById(R.id.iv_2);
        tv_page = (TextView) findViewById(R.id.tv_page);

        iv_next.setVisibility(View.INVISIBLE);
        iv_previous.setVisibility(View.INVISIBLE);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startGame();

            }
        });

        iv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index == 25)return;

                index++;
                iv_1.setImageDrawable(getResources().getDrawable(
                        al_card[index*2]));
                iv_2.setImageDrawable(getResources().getDrawable(
                        al_card[index*2+1]));

                tv_page.setText(index+1+"");

            }
        });

        iv_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(index == 0)return;

                index--;
                iv_1.setImageDrawable(getResources().getDrawable(
                        al_card[index*2]));
                iv_2.setImageDrawable(getResources().getDrawable(
                        al_card[index*2+1]));

                tv_page.setText(index+1+"");

            }
        });

    }

    public void startGame()
    {
        index = 0;
        al_card[0] =(R.drawable.card_1);
        al_card[1] =(R.drawable.card_2);
        al_card[2] = (R.drawable.card_3);
        al_card[3] = (R.drawable.card_4);
        al_card[4] = (R.drawable.card_5);
        al_card[5] = (R.drawable.card_6);
        al_card[6] = (R.drawable.card_7);
        al_card[7] = (R.drawable.card_8);
        al_card[8] = (R.drawable.card_9);
        al_card[9] = (R.drawable.card_10);
        al_card[10] = (R.drawable.card_11);
        al_card[11] = (R.drawable.card_12);
        al_card[12] = (R.drawable.card_13);
        al_card[13] = (R.drawable.card_14);
        al_card[14] = (R.drawable.card_15);
        al_card[15] = (R.drawable.card_16);
        al_card[16] = (R.drawable.card_17);
        al_card[17] = (R.drawable.card_18);
        al_card[18] = (R.drawable.card_19);
        al_card[19] = (R.drawable.card_20);
        al_card[20] = (R.drawable.card_21);
        al_card[21] = (R.drawable.card_22);
        al_card[22] = (R.drawable.card_23);
        al_card[23] = (R.drawable.card_24);
        al_card[24] = (R.drawable.card_25);
        al_card[25] = (R.drawable.card_26);
        al_card[26] = (R.drawable.card_27);
        al_card[27] = (R.drawable.card_28);
        al_card[28] = (R.drawable.card_29);
        al_card[29] = (R.drawable.card_30);
        al_card[30] = (R.drawable.card_31);
        al_card[31] = (R.drawable.card_32);
        al_card[32] = (R.drawable.card_33);
        al_card[33] = (R.drawable.card_34);
        al_card[34] = (R.drawable.card_35);
        al_card[35] = (R.drawable.card_36);
        al_card[36] = (R.drawable.card_37);
        al_card[37] = (R.drawable.card_38);
        al_card[38] = (R.drawable.card_39);
        al_card[39] = (R.drawable.card_40);
        al_card[40] = (R.drawable.card_41);
        al_card[41] = (R.drawable.card_42);
        al_card[42] = (R.drawable.card_43);
        al_card[43] = (R.drawable.card_44);
        al_card[44] = (R.drawable.card_45);
        al_card[45] = (R.drawable.card_46);
        al_card[46] = (R.drawable.card_47);
        al_card[47] = (R.drawable.card_48);
        al_card[48] = (R.drawable.card_49);
        al_card[49] = (R.drawable.card_50);
        al_card[50] = (R.drawable.card_51);
        al_card[51] = (R.drawable.card_52);

        al_card = getRandomArray(al_card);

        iv_1.setImageDrawable(getResources().getDrawable(
                al_card[index*2]));
        iv_2.setImageDrawable(getResources().getDrawable(
                al_card[index*2+1]));

        tv_page.setText(index+1+"");

        iv_next.setVisibility(View.VISIBLE);
        iv_previous.setVisibility(View.VISIBLE);
    }

    private int[] getRandomArray(int[] mArray)
    {
        int mLength = mArray.length;
        int mRandom, mNumber;

        for(int i = 0; i < mLength; i++)
        {
            mRandom = (int)(Math.random() * mLength);
            mNumber = mArray[i];
            mArray[i] = mArray[mRandom];
            mArray[mRandom] = mNumber;
        }

        return mArray;
    }

}
