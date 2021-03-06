package zsy.structure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import zsy.structure.view.PathView;

/**
 * Created by Zsy on 2019/9/5.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final PathView pathView = findViewById(R.id.pathview);
        pathView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pathView.aniPath();
            }
        });
    }

    public void queue(View view) {
        startActivity(new Intent(this, QueueActivity.class));
    }

    public void stack(View view) {
        startActivity(new Intent(this, StackActivity.class));
    }

    public void linked(View view) {
        startActivity(new Intent(this, LinkedActivity.class));
    }

    public void binary(View view) {
        startActivity(new Intent(this, BinaryActivity.class));
    }

    public void redblack(View view) {
        startActivity(new Intent(this, RedBlackActivity.class));
    }

}
