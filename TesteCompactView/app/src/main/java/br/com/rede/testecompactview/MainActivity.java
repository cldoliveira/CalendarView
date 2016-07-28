package br.com.rede.testecompactview;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CompactCalendarView compactCalendarView = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        Typeface typeface_header = Typeface.createFromAsset(getAssets(),"opensans_bold.ttf");
        Typeface typeface_body = Typeface.createFromAsset(getAssets(), "opensans_regular.ttf");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.DAY_OF_MONTH, 5);


        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.MONTH, 6);
        calendar2.set(Calendar.YEAR, 2016);
        calendar2.set(Calendar.DAY_OF_MONTH,10);


        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(Calendar.MONTH, 6);
        calendar3.set(Calendar.YEAR, 2016);
        calendar3.set(Calendar.DAY_OF_MONTH,7);



        long timeMillis = calendar.getTimeInMillis();
        long timeMillis2 = calendar2.getTimeInMillis();
        long timeMillis3 = calendar3.getTimeInMillis();

        /* Evento
        1 - para circulo
        2 - para quadrados
        3 - para triângulos
         */


        Event ev1 = new Event(Color.argb(255,0,183,179), timeMillis, "Some Information",2);
        Event ev2 = new Event(Color.argb(255,237,28,34), timeMillis, "Some Information",3);

        Event ev3 = new Event(Color.argb(255,237, 28,34), timeMillis2, "SomeInformation",3);

        Event ev4 = new Event(Color.argb(255,255,239,3), timeMillis3, "Some Information",1);


        compactCalendarView.setLocale(new Locale("pt", "BR"));
        compactCalendarView.setShouldShowMondayAsFirstDay(false);
        compactCalendarView.setUseThreeLetterAbbreviation(true);
        compactCalendarView.setCalendarHeaderTextColor(Color.argb(255, 0, 183, 179));
        compactCalendarView.setCalendarHeaderTypeface(typeface_header);
        compactCalendarView.setCalendarBodyTypeface(typeface_body);
        compactCalendarView.setIndicatorRadius(4.5f);
        compactCalendarView.addEvent(ev1,true);
        compactCalendarView.addEvent(ev2,true);
        compactCalendarView.addEvent(ev3,true);
        compactCalendarView.addEvent(ev4,true);




    }
}
