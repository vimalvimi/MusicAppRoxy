package com.example.android.musicapproxy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView album = (TextView) findViewById(R.id.album_button);
        TextView artist = (TextView) findViewById(R.id.artist_button);
        TextView genre = (TextView) findViewById(R.id.genre_button);

        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        genre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(PlaylistActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });
    }
}