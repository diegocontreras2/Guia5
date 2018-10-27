package org.dev4u.hv.guia5_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {

    Animation anim_COMBINADODer;
    Animation anim_COMBINADOIz;
    Animation anim_COMBINADOCen;
    Animation anim_rotar;
    Button btnIzq,btnCent,btnDer;
    ImageView imgCoronaIzq;
    ImageView imgCoronaCent;
    ImageView imgCoronaDer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);

        btnIzq    = (Button) findViewById(R.id.btnIzquerda);
        btnCent    = (Button) findViewById(R.id.btnCentro);
        btnDer    = (Button) findViewById(R.id.btnDerecha);

        imgCoronaIzq = (ImageView) findViewById(R.id.ivCoronaIzq);
        imgCoronaCent = (ImageView) findViewById(R.id.ivCoronaCent);
        imgCoronaDer = (ImageView) findViewById(R.id.ivCoronaDer);

        anim_rotar = AnimationUtils.loadAnimation(this, R.anim.rotar);

        anim_COMBINADOIz = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        anim_COMBINADOIz.setDuration(1000);
        anim_COMBINADOIz.setFillAfter(true);

        anim_COMBINADOCen = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        anim_COMBINADOCen.setDuration(1000);
        anim_COMBINADOCen.setFillAfter(true);

        anim_COMBINADODer = AnimationUtils.loadAnimation(this, R.anim.bajar_aparecer);
        anim_COMBINADODer.setDuration(1000);
        anim_COMBINADODer.setFillAfter(true);

        btnIzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgCoronaIzq.startAnimation(anim_COMBINADOIz);

            }
        });
        btnCent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgCoronaCent.startAnimation(anim_COMBINADOCen);
                //imgCoronaCent.clearAnimation();
            }
        });
        btnDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(anim_rotar);
                imgCoronaDer.startAnimation(anim_COMBINADODer);
                //imgCoronaDer.clearAnimation();
            }
        });
    }
}
