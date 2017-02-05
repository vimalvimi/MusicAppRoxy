package com.example.android.musicapproxy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView album = (TextView) findViewById(R.id.album_button);
        TextView artist = (TextView) findViewById(R.id.artist_button);
        TextView genre = (TextView) findViewById(R.id.genre_button);
        TextView playlist = (TextView) findViewById(R.id.playlist_button);

        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        genre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

    }

}

