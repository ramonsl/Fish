package com.example.ramonsl.fish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fish> fishs = new ArrayList<>();
        fishs.add(new Fish("Guppy","Poecilia reticulata",getDrawable(R.drawable.guppy),7.0,"Linhagem thailandesa com idade de 60 dias. Foto real de uma macho. Verifique videos reais no Instagram ou Facebook."));
        fishs.add(new Fish("Severo","Heros severus",getDrawable(R.drawable.severum),6.0,"Peixes considerados jumbos, crescem normalmente até 20-30 cm. pH normalmente neutro, temperatura 28 graus, comportamento costuma ser agressivo. Recomendado somente para aquaristas mais experientes. Aquários acima de 200 litros."));
        fishs.add(new Fish("Pseudotropheus Saulosi ","Pseudotropheus Saulosi s",getDrawable(R.drawable.severum),8.0,"Coloração juvenil amarela. Os machos se transformam e ficam com cor azul metálica. As fêmeas permanecem amarelas."));
    }
}
