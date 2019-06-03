package ke.co.techcamp.newstv;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class TVActivity extends YouTubeBaseActivity {
    private YouTubePlayerView youplayerviewer;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    private final static String API_KEY = "AIzaSyC1L1HhZwx8ZT-OKcvJgKgFFwkvYMOJMfM";
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Intent intent = getIntent();
        url = intent.getStringExtra("vidurl");

        youplayerviewer = (YouTubePlayerView) findViewById(R.id.youview);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(url);
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        youplayerviewer.initialize(API_KEY,onInitializedListener);

    }

    public void Chanels(View view) {
        Intent myIn = new Intent(TVActivity.this,MainActivity.class);
        startActivity(myIn);
    }
}
