package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("Tom", "description", 1, false);
        Button Btn = findViewById(R.id.FOLLOW);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!user.Followed) {
                    Btn.setText("UNFOLLOW");
                    user.Followed = true;
                }
                else{
                    Btn.setText("FOLLOW");
                    user.Followed = false;
                }
            }
        });
    }
}