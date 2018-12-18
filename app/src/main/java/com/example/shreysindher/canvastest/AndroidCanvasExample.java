package com.example.shreysindher.canvastest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AndroidCanvasExample extends Activity {

    private CanvasView customCanvas;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCanvas = findViewById(R.id.signature_canvas);
        clear = findViewById(R.id.btn_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearCanvas(customCanvas);
            }
        });
    }

    public void clearCanvas(View v) {
        customCanvas.clearCanvas();
    }
}
