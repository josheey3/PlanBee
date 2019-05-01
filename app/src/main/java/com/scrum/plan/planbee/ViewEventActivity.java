package com.scrum.plan.planbee;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;




public class ViewEventActivity extends AppCompatActivity {



    private NavigationView navView;
    private DrawerLayout drawLayout;
    private ImageButton btnOpenNav, btnOpenSettings;

    private TextView txtEventTitle;
    private TextView txtDate;
    private TextView txtLocation;
    private TextView txtHost;
    private TextView txtGroupName;
    private TextView txtDescription;
    private ImageView imgEvent;

    //Arrays for the title and image of each item in the event scroller
    //private int[] eventIcons = new int[]{R.drawable.chat_bpi, R.drawable.chat_default, R.drawable.chat_trumpet, R.drawable.chat_scrum, R.drawable.chat_cinema, R.drawable.chat_climbing, R.drawable.chat_paintballing, R.drawable.chat_board_game, R.drawable.chat_bu, R.drawable.chat_11,R.drawable.toy_story_4_icon, R.drawable.reading_festival_icon, R.drawable.bournemouth_fc_logo, R.drawable.basketball_icon, R.drawable.board_game_cafe_icon, R.drawable.sand_sculpture_logo};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int eventIndex = intent.getIntExtra(MyEventsActivity.EXTRA_POS,0);
        setContentView(R.layout.activity_view_event);

        EventCollection events = new EventCollection();
        events.generateEvent(eventIndex);
        Event event = events.getEvent(eventIndex);

        txtEventTitle = findViewById(R.id.txtEventTitle);
        txtDate = findViewById(R.id.txtDate);
        txtLocation = findViewById(R.id.txtLocation);
        txtHost = findViewById(R.id.txtHost);
        txtGroupName = findViewById(R.id.txtGroupName);
        txtDescription = findViewById(R.id.txtDescription);
        imgEvent = findViewById(R.id.imgEvent);


        txtEventTitle.setText(event.getName());
        txtDate.setText(event.getDate());
        txtLocation.setText(event.getLocation());
        txtHost.setText(event.getHost());
        txtGroupName.setText(event.getGroup().getName());
        txtDescription.setText(event.getDescription());
        imgEvent.setImageResource(event.getImage());

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_home:
                        startActivity(new Intent(ViewEventActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(ViewEventActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(ViewEventActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(ViewEventActivity.this, GroupChatsActivity.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(ViewEventActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_browse_events:
                        startActivity(new Intent(ViewEventActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_calendar:
                        startActivity(new Intent(ViewEventActivity.this, CalendarActivity.class));
                        break;
                    case R.id.nav_my_events:
                        startActivity(new Intent(ViewEventActivity.this, MyEventsActivity.class));
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
                Intent intent = new Intent(ViewEventActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

    }
}
