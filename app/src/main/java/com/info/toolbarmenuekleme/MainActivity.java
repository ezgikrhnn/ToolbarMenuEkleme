package com.info.toolbarmenuekleme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("Toolbar Menu");
        setSupportActionBar(toolbar);
        //toolbarımı çalışır hale getirdim şimdi buna menü ekleyecegim: Res dosyası içinde menü oluşturup tasarımıma ekleme yaptım.
        //şimdi ise kodunu yazacağım: on create metodu dışında olacak
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;  //menuyu ekledik şimdi menu seceneklerine nasıl tıklanabilir şeklinde işlem yapacagım
    }

    //menudeki itemların tıklanılabilir olması için işlem yapacağım.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_bilgi:
                Toast.makeText(getApplicationContext(), "Bilgi tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_ayarlar:
                Toast.makeText(getApplicationContext(), "Ayarlar tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_ekle:
                Toast.makeText(getApplicationContext(), "Ekle tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cikis:
                Toast.makeText(getApplicationContext(), "Cıkış tıklandı", Toast.LENGTH_SHORT).show();
                return true;
            default:  //switch_case yapısında bir de default degeri yazılıyordu.
                return super.onOptionsItemSelected(item);
        }

    }
}