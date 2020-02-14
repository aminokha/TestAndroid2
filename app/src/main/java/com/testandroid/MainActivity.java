package com.testandroid;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.text.Format;

public class MainActivity extends AppCompatActivity {
    EditText fik1=null;
    EditText fik2=null;
    EditText aki=null;
    EditText oso1=null;
    EditText oso2=null;
    EditText tah=null;
    EditText manh1=null;
    EditText manh2=null;
    EditText qur=null;
    EditText itisa=null;
    EditText sira=null;
    EditText nahw=null;
    EditText eng=null;
    EditText inf=null;
    TextView moy=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
         fik1= findViewById(R.id.fik1);
         fik2= findViewById(R.id.fik2);
         aki = findViewById(R.id.aki);
         oso1 = findViewById(R.id.oso1);
         oso2= findViewById(R.id.oso2);
         tah= findViewById(R.id.tah);
         manh1= findViewById(R.id.manh1);
         manh2= findViewById(R.id.manh2);
         qur= findViewById(R.id.qur);
         itisa= findViewById(R.id.itisa);
         sira= findViewById(R.id.sira);
         nahw= findViewById(R.id.nahw);
         eng= findViewById(R.id.eng);
         inf= findViewById(R.id.inf);
         moy = findViewById(R.id.moy);
    }

    public void calculate(View view) {
        double moye =0;
        double fik1_ = Double.valueOf(fik1.getText().toString());
        double fik2_ = Double.valueOf(fik2.getText().toString());
        double aki1_ = Double.valueOf(aki.getText().toString());
        double oso1_ = Double.valueOf(oso1.getText().toString());
        double oso2_ = Double.valueOf(oso2.getText().toString());
        double tah_ = Double.valueOf(tah.getText().toString());
        double manh1_ = Double.valueOf(manh1.getText().toString());
        double manh2_ = Double.valueOf(manh2.getText().toString());
        double qur_ = Double.valueOf(qur.getText().toString());
        double itisa_ = Double.valueOf(itisa.getText().toString());
        double sira_ = Double.valueOf(sira.getText().toString());
        double nahw_ = Double.valueOf(nahw.getText().toString());
        double eng_ = Double.valueOf(eng.getText().toString());
        double inf_ = Double.valueOf(inf.getText().toString());

        moye = (((fik1_+fik2_)*1.5)+(aki1_*2)+(oso1_+oso2_)+(tah_*2)+((manh1_+manh2_)/2)+qur_+itisa_+sira_+nahw_+eng_+inf_)/16;
        String s = String.format("%.2f", moye );
        moy.setText(s);
    }
}
