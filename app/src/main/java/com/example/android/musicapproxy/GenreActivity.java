package com.example.android.musicapproxy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        TextView album = (TextView) findViewById(R.id.album_button);
        TextView artist = (TextView) findViewById(R.id.artist_button);
        TextView playlist = (TextView) findViewById(R.id.playlist_button);

        album.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(GenreActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(GenreActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(GenreActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}