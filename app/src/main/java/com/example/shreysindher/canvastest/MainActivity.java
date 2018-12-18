package com.example.shreysindher.canvastest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private CanvasView customCanvas;
    Button clear;

    public static final int[] xCo = {105, 104, 521, 522};
    public static final int[] yCo = {72, 368, 370, 71};

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

        drawCanvas(customCanvas, xCo, yCo);
    }

    public void clearCanvas(View v) {
        customCanvas.clearCanvas();
    }

    public void drawCanvas(View v, int[] x, int[] y) {

    }
}
