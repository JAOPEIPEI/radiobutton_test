package com.example.user.radiobutton;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.PowerManager;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    RadioGroup emotion_text_group;
    RadioButton emotion_img_radio1,emotion_img_radio2,emotion_img_radio3,emotion_img_radio4,emotion_img_radio5,emotion_img_radio6,emotion_img_radio7,emotion_img_radio8,emotion_img_radio9;
    RadioButton emotion_text_radio1,emotion_text_radio2,emotion_text_radio3,emotion_text_radio4,emotion_text_radio5,emotion_text_radio6,emotion_text_radio7,emotion_text_radio8,emotion_text_radio9;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                PowerManager powerManager = (PowerManager) getSystemService(POWER_SERVICE);
//                PowerManager.WakeLock wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MyWakelockTag");
//                wakeLock.acquire();
                LayoutInflater inflaterdialog =MainActivity.this.getLayoutInflater();
                View emotion_img = inflaterdialog.inflate(R.layout.dialog_emotion_text,null);


                emotion_text_group = (RadioGroup) emotion_img.findViewById(R.id.radioGroup_img);

                emotion_img_radio1 = (RadioButton) emotion_img.findViewById(R.id.btn_0_img);
                emotion_img_radio2 = (RadioButton) emotion_img.findViewById(R.id.btn_1_img);
                emotion_img_radio3 = (RadioButton) emotion_img.findViewById(R.id.btn_2_img);
                emotion_img_radio4 = (RadioButton) emotion_img.findViewById(R.id.btn_3_img);
                emotion_img_radio5 = (RadioButton) emotion_img.findViewById(R.id.btn_4_img);
                emotion_img_radio6 = (RadioButton) emotion_img.findViewById(R.id.btn_5_img);
                emotion_img_radio7 = (RadioButton) emotion_img.findViewById(R.id.btn_6_img);
                emotion_img_radio8 = (RadioButton) emotion_img.findViewById(R.id.btn_7_img);
                emotion_img_radio9 = (RadioButton) emotion_img.findViewById(R.id.btn_8_img);



                 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);


                View view_image = inflaterdialog.inflate(R.layout.dialog_image,null);


                builder.setTitle("選擇您目前的情緒圖");
                builder.setView(view_image);
                builder.setPositiveButton("確定",null);
                builder.setCancelable(false);

                final AlertDialog alertDialog = builder.create();
                //show dialog
                alertDialog.show();


                Button img_btn = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                img_btn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

//                                                Intent i = new Intent(MainActivity.this,MainActivity.class);
//                                                startActivity(i);
                                                ContextThemeWrapper contextThemeWrapper =new ContextThemeWrapper(MainActivity.this, R.style.dialog);
                                                final AlertDialog.Builder dialog_emotion_text = new AlertDialog.Builder(contextThemeWrapper);


//
                                                emotion_text_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                                    @Override
                                                    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                                                        if(emotion_img_radio1.isChecked())

                                                        {
                                                            // appendlog("點擊情緒圖:1");
                                                            Log.i("點擊情緒圖", "1");
                                                            alertDialog.dismiss();
                                                        } else if(emotion_img_radio2.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:2");
                                                            Log.i("點擊情緒圖", "2");
                                                            alertDialog.dismiss();
                                                        } else if(emotion_img_radio3.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:3");
                                                            Log.i("點擊情緒圖", "3");
                                                            alertDialog.dismiss();
                                                        } else if(emotion_img_radio4.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:4");
                                                            Log.i("點擊情緒圖", "4");
                                                            alertDialog.dismiss();
                                                        }else if(emotion_img_radio5.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:5");
                                                            Log.i("點擊情緒圖", "5");
                                                            alertDialog.dismiss();
                                                        } else if(emotion_img_radio6.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:6");
                                                            Log.i("點擊情緒圖", "6");
                                                            alertDialog.dismiss();
                                                        } else if(emotion_img_radio7.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:7");
                                                            Log.i("點擊情緒圖", "7");
                                                            alertDialog.dismiss();
                                                        }else if(emotion_img_radio8.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:8");
                                                            Log.i("點擊情緒圖", "8");
                                                            alertDialog.dismiss();
                                                        } else if(emotion_img_radio9.isChecked())

                                                        {
                                                            //appendlog("點擊情緒圖:9");
                                                            Log.i("點擊情緒圖", "9");
                                                            alertDialog.dismiss();
                                                        }else

                                                        {
                                                            Toast.makeText(MainActivity.this, "請選擇一個情緒", Toast.LENGTH_SHORT).show();

                                                        }
                                                    }

                                            });
                            }


//                                dialog_emotion.setTitle("選擇您目前的情緒文字")
//                                        .setView(emotion_img)
//                                        .setPositiveButton("確定",new DialogInterface.OnClickListener() {
//                                            @Override
//                                            public void onClick(DialogInterface dialog, int which) {
//                                                LayoutInflater inflaterdialog =MainActivity.this.getLayoutInflater();
//                                                View emotion_text = inflaterdialog.inflate(R.layout.dialog_emotion_text,null);
//
//                                                emotion_text_group = (RadioGroup) emotion_text.findViewById(R.id.radioGroup_text);
//                                                emotion_text_radio1 = (RadioButton) emotion_text.findViewById(R.id.btn_0);
//                                                emotion_text_radio2 = (RadioButton) emotion_text.findViewById(R.id.btn_1);
//                                                emotion_text_radio3 = (RadioButton) emotion_text.findViewById(R.id.btn_2);
//                                                emotion_text_radio4 = (RadioButton) emotion_text.findViewById(R.id.btn_3);
//                                                emotion_text_radio5 = (RadioButton) emotion_text.findViewById(R.id.btn_4);
//                                                emotion_text_radio6 = (RadioButton) emotion_text.findViewById(R.id.btn_5);
//                                                emotion_text_radio7 = (RadioButton) emotion_text.findViewById(R.id.btn_6);
//                                                emotion_text_radio8 = (RadioButton) emotion_text.findViewById(R.id.btn_7);
//                                                emotion_text_radio9 = (RadioButton) emotion_text.findViewById(R.id.btn_8);
//
//                                            }
//                                        })
//                                        .setCancelable(false)
//                                        .show();






                });


             }
        });
    }
}