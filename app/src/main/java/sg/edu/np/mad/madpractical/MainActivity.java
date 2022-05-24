package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User user = new User("Tom", "description", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Btn = findViewById(R.id.FOLLOW);
        TextView title = findViewById(R.id.textView);
        title.setText(user.Name);

        TextView desc = findViewById(R.id.TestText);
        desc.setText(user.Description);
        initialise(user);
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
    public void initialise(User user) {
        Button followButton = findViewById(R.id.FOLLOW);
        if (user.Followed) {
            followButton.setText("UNFOLLOW");
        } else {
            followButton.setText("FOLLOW");
        }
    }
}