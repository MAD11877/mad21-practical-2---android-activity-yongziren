package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    User user = new User("Tom", "description", 1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        Button Btn = findViewById(R.id.FOLLOW);
        if (user.Followed == false) {
            Btn.setText("UNFOLLOW");
            user.Followed = true;
        }
        else if (user.Followed) {
            Btn.setText("FOLLOW");
            user.Followed = false;
        }
    }
}