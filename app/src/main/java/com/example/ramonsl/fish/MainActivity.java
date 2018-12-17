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
        fishs.add(new Fish("Pseudotropheus Saulosi ","Pseudotropheus Saulosi s",getDrawable(R.drawable.saulosimacho),8.0,"Coloração juvenil amarela. Os machos se transformam e ficam com cor azul metálica. As fêmeas permanecem amarelas."));
        fishs.add(new Fish("Acará Bandeira Albino ","Pterophyllum scalare",getDrawable(R.drawable.bandeira),7.0,"Bandeira criado em aquário, com excelente controle de qualidade de cor e padrão. Acostumados com ração industrializada, isentando a necessidade de alimento vivo. Diferente da maioria dos bandeiras do mercado criados em tanques, estes criados em aquários não são tímidos, tem alta resistência, são livres de doenças e se adaptam com muito mais facilidade ao transporte. Confira!!"));
        fishs.add(new Fish("Botia Palhaço ","Botia macracanthus",getDrawable(R.drawable.botia),6.0,"Botia criado em aquário"));
        fishs.add(new Fish("Balashark ","Balantiocheilus melanopterus",getDrawable(R.drawable.sharkbala),7.1,"Linhagem thailandesa com idade de 60 dias."));

    }
}
