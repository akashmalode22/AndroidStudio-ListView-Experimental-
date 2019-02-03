package com.example.pokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] pokemon = new String[] {"Pikachu", "Raichu", "Bulbasaur", "Squirtle", "Charmander"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        // android.R.layout.simple_list_item_1 --> Makes list view with text only in straight horizontal lines
        ArrayAdapter<String> pokemonAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, pokemon);
        // ArrayAdapter --> turns array into view. Pretty much DYNAMICALLY ALLOCATING ON THE GO!

        listView.setAdapter(pokemonAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println("Tapped " + position );

        Intent moveToDetailIntent = new Intent (getBaseContext(), PokemonDetailActivity.class);
        moveToDetailIntent.putExtra("pokemonName", pokemon[position]);
        startActivity(moveToDetailIntent);

    }
}
