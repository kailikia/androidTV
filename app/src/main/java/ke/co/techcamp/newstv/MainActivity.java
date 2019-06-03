package ke.co.techcamp.newstv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.player.YouTubeBaseActivity;

public class MainActivity extends YouTubeBaseActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, TVActivity.class);
    }

    public void France24(View view) {
        intent.putExtra("vidurl", "IBlUM-0NZZU");
        startActivity(intent);
    }

    public void Aljazeera(View view) {
        intent.putExtra("vidurl","0M-pPonAjeM");
        startActivity(intent);
    }

    public void K24(View view) {
        intent.putExtra("vidurl", "ogdJevCYtJU");
        startActivity(intent);
    }

    public void DW(View view) {
        intent.putExtra("vidurl", "NvqKZHpKs-g");
        startActivity(intent);
    }

    public void CNN(View view) {
        intent.putExtra("vidurl", "C-QONUWzeLE");
        startActivity(intent);
    }

    public void Fox(View view) {
        intent.putExtra("vidurl", "tr5Ogyx9-iM");
        startActivity(intent);
    }
}
