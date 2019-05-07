package com.scrum.plan.planbee;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.scrum.plan.planbee.MyEventsActivity.EXTRA_POS;

public class
CalendarActivity extends AppCompatActivity {
    private NavigationView navView;
    private DrawerLayout drawLayout;
    private ImageButton btnOpenNav;
    private CompactCalendarView calendar;
    private TextView txtCalendar;
    private TextView txtEventTitle;
    private TextView txtTime;

    private Button btnConfim;
    private Button btnMoreInfo;
    private ImageView imgBee;
    private ImageView imgMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_home:
                        startActivity(new Intent(CalendarActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(CalendarActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(CalendarActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(CalendarActivity.this, GroupChatsActivity.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(CalendarActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_browse_events:
                        startActivity(new Intent(CalendarActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_calendar:
                        //already here
                        break;
                    case R.id.nav_my_events:
                        startActivity(new Intent(CalendarActivity.this, MyEventsActivity.class));
                        break;
                }
                return false;
            }
        });

        drawLayout = findViewById(R.id.drawer_layout);
        btnOpenNav = findViewById(R.id.btn_open_nav);
        btnOpenNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawLayout.openDrawer(Gravity.LEFT);
            }
        });

        calendar = findViewById(R.id.compactcalendar_view);
        txtCalendar = findViewById(R.id.calendarDate);
        txtEventTitle = findViewById(R.id.calendarText);
        txtTime = findViewById(R.id.calendar_time);
        btnConfim = findViewById(R.id.btnCalConfirm);
        btnMoreInfo = findViewById(R.id.btnCalMoreInfo);
        imgBee = findViewById(R.id.imgCalBee);
        imgMap = findViewById(R.id.imgMap);


        calendar.setUseThreeLetterAbbreviation(true);


        //add events

        final EventCollection events = new EventCollection();
        events.generateEvents();

        for (com.scrum.plan.planbee.Event setEvent : events.getEvents()) {
            Event event = new Event(Color.BLACK, setEvent.getEpoch(), setEvent.getName());
            calendar.addEvent(event);
        }

        calendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                String date = new java.text.SimpleDateFormat("MM/dd/yyyy").format(new java.util.Date(dateClicked.getTime()));

                final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.calendar_scrlNames);

                if (events.getAllDates().contains(date)) {
                    final int selectedIndex = events.getAllDates().indexOf(date);
                    com.scrum.plan.planbee.Event selectedEvent = events.getEvents().get(selectedIndex);
                    txtEventTitle.setText(selectedEvent.getName());
                    txtTime.setText(selectedEvent.getLocation() + "\n" +
                            selectedEvent.getDate());
                    final ArrayList<String> names = selectedEvent.getAttendees().getNames();


                    linearLayout.setVisibility(View.VISIBLE);
                    linearLayout.removeAllViews();

                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    linearLayout.setOrientation(LinearLayout.VERTICAL);

                    imgBee.setVisibility(View.INVISIBLE);
                    btnConfim.setVisibility(View.VISIBLE);
                    btnMoreInfo.setVisibility(View.VISIBLE);
                    imgMap.setVisibility(View.VISIBLE);

                    TextView textView = new TextView(context);
                    textView.setText("Current Swarm");
                    textView.setId(0);
                    textView.setLayoutParams(params);
                    linearLayout.addView(textView);

                    btnConfim.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            names.add("You");
                            if (imgBee.getVisibility() == View.INVISIBLE) {
                                imgBee.setVisibility(View.VISIBLE);
                            } else {
                                imgBee.setVisibility(View.INVISIBLE);
                            }
                        }

                    });

                    btnMoreInfo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(CalendarActivity.this, ViewEventActivity.class);
                            intent.putExtra(EXTRA_POS, selectedIndex);
                            startActivity(intent);
                        }

                    });

                    for (int j = 0; j < names.size(); j++) {
                        Button button = new Button(context);
                        button.setText(names.get(j));
                        button.setVisibility(View.VISIBLE);
                        button.setId(j);
                        linearLayout.addView(button);
                    }






                } else {
                    txtEventTitle.setText("No Events");
                    txtTime.setText("");
                    imgBee.setVisibility(View.INVISIBLE);
                    btnConfim.setVisibility(View.INVISIBLE);
                    btnMoreInfo.setVisibility(View.INVISIBLE);
                    imgMap.setVisibility(View.INVISIBLE);

                    linearLayout.setVisibility(View.INVISIBLE);
                }
                txtCalendar.setText(date.substring(3, 5));
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {

            }
        });


        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        Date date = new Date();
        txtCalendar.setText(formatter.format(date));
        txtEventTitle.setText("No events today");
        btnConfim.setVisibility(View.INVISIBLE);
        btnMoreInfo.setVisibility(View.INVISIBLE);
        imgBee.setVisibility(View.INVISIBLE);
        imgMap.setVisibility(View.INVISIBLE);


    }

}
