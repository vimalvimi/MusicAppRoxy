package com.example.android.musicapproxy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        TextView artist = (TextView) findViewById(R.id.artist_button);
        TextView genre = (TextView) findViewById(R.id.genre_button);
        TextView playlist = (TextView) findViewById(R.id.playlist_button);

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        genre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(AlbumActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(AlbumActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}