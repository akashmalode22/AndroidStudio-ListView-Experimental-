package com.example.pokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PokemonDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView typeTextView;
    TextView evolutionTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        typeTextView = (TextView) findViewById(R.id.typeTextView);
        evolutionTextView = (TextView) findViewById(R.id.evolutionTextView);
        imageView = (ImageView) findViewById(R.id.imageView);


        String pokemonName = (String) getIntent().getExtras().get("pokemonName");

        nameTextView.setText(pokemonName);

        if (pokemonName.equals("Raichu")) {
            typeTextView.setText("Type: Lightning 2");
        }
        if (pokemonName.equals("Charmander")) {
            typeTextView.setText("Type: Fire");
        }
        if (pokemonName.equals("Squirtle")) {
            typeTextView.setText("Type: Water");
        }
        if (pokemonName.equals("Bulbasaur")) {
            typeTextView.setText("Type: Grass");
        }
        if (pokemonName.equals("Pikachu")) {
            typeTextView.setText("Type: Lightning");
        }

        // Image Management

        imageView.setImageResource(R.mipmap.raichu);


    }
}
