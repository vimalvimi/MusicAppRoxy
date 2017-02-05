package com.example.android.musicapproxy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView album = (TextView) findViewById(R.id.album_button);
        TextView genre = (TextView) findViewById(R.id.genre_button);
        TextView playlist = (TextView) findViewById(R.id.playlist_button);

        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        genre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(ArtistActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}