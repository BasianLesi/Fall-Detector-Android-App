package com.example.roni.falling;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.hardware.SensorEventListener;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        LineChart lineChart = (LineChart) findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList();
                entries.add(new Entry(4f, 0));
                entries.add(new Entry(8f, 1));
                entries.add(new Entry(6f, 2));
                entries.add(new Entry(2f, 3));
                entries.add(new Entry(18f, 4));
                entries.add(new Entry(9f, 5));

        LineDataSet dataset = new LineDataSet(entries, "Number of calls");

        ArrayList<String> labels = new ArrayList<String>();
                labels.add("January&quot");
                labels.add("February");
                labels.add("March&quot");
                labels.add("April&quot");
                labels.add("May&quot");
                labels.add("June&quot");

        //LineData data = new LineData(labels, dataset);
                //lineChart.setData(data); // set the data and list of lables into chart

    }


}
