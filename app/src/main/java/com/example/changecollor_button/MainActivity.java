package com.example.changecollor_button;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change(View view){
        // получаем ресурсы
        Resources resources = getResources();
        // объявляем переменную для получения цвета red
        int textColor = resources.getColor(R.color.purple_700, null);
        //находим текстовое окно
        TextView textView =findViewById(R.id.textView);
        // используем ресурсы color
        textView.setTextColor(textColor);

    }
}