package com.scrum.plan.planbee;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MyEventsActivity extends AppCompatActivity {

    public static final String EXTRA_POS = "com.scrum.plan.planbee.IMG_POS";

    private RecyclerView eventsView;
    private ArrayList<MyEventsModel> eventsArrayList;
    private MyEventsAdapter adapter;
    private NavigationView navView;
    private DrawerLayout drawLayout;
    private ImageButton btnOpenNav, btnOpenSettings;

    private String[] eventTitles = new String[]{"BPI Group Meeting", "Drinks with the bois", "Band rehearsal", "Scrum 4 due", "Cinema", "Climbing", "Paint balling", "D&D", "BU Guest Lecture", "Team meeting"};
    private int[] eventIcons = new int[]{R.drawable.chat_bpi, R.drawable.chat_default, R.drawable.chat_trumpet, R.drawable.chat_scrum, R.drawable.chat_cinema, R.drawable.chat_climbing, R.drawable.chat_paintballing, R.drawable.chat_board_game, R.drawable.chat_bu, R.drawable.chat_11};
    private String[] eventUpcoming = new String[]{"Talbot Campus\n1pm March 3rd", "Mary Shelley\n9pm March 3rd", "Music room\n2pm March 4th", "Brightspace\n12pm March 7th", "Odeon\n7pm March 8th", "The Project\n5pm March 15th", "BU Paintball\n1pm March 22nd", "Talbot Campus\n8pm March 23rd", "Talbot Campus\n11am March 25th", "Talbot Campus\n1:30pm March 29th"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_events);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_home:
                        startActivity(new Intent(MyEventsActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(MyEventsActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(MyEventsActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(MyEventsActivity.this, GroupChatsActivity.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(MyEventsActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_browse_events:
                        startActivity(new Intent(MyEventsActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_calendar:
                        startActivity(new Intent(MyEventsActivity.this, CalendarActivity.class));
                        break;
                    case R.id.nav_my_events:
                        //already here
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

        btnOpenSettings = findViewById(R.id.btn_open_settings);
        btnOpenSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyEventsActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        // Events recycler
        eventsView = findViewById(R.id.my_events_recycler);
        eventsArrayList = getMyEvents();
        adapter = new MyEventsAdapter(this, eventsArrayList);
        eventsView.setAdapter(adapter);
        eventsView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, eventsView ,new RecyclerItemClickListener.OnItemClickListener() {

            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MyEventsActivity.this, ViewEventActivity.class);
                intent.putExtra(EXTRA_POS, position);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                        // do whatever
            }

                })
        );

        eventsView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<MyEventsModel> getMyEvents(){
        ArrayList<MyEventsModel> myEvents = new ArrayList<>();

        for(int i = 0; i < eventTitles.length; i++){
            MyEventsModel eventModel = new MyEventsModel();
            eventModel.setName(eventTitles[i]);
            eventModel.setImage_drawable(eventIcons[i]);
            eventModel.setUpcoming(eventUpcoming[i]);
            myEvents.add(eventModel);
        }
        return myEvents;
    }
}
