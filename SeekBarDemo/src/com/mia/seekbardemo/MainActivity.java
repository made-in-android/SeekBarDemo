package com.mia.seekbardemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final SeekBar seek = (SeekBar) findViewById(R.id.seekBar1);
        
        seek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
        	
        	int change = 0;
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				change=progress;		
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub	
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, Integer.toString(change), Toast.LENGTH_SHORT).show();
			}   	
        });        
        }
    }