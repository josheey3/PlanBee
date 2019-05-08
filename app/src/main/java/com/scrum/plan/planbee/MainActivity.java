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
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;

import static com.scrum.plan.planbee.MyEventsActivity.EXTRA_POS;

public class MainActivity extends AppCompatActivity {
    private RecyclerView upcomingView, nearbyView, recommendedView, sponsoredView, popularView, top10View, newView;
    private EventAdapter adapterUpcoming, adapterNearby, adapterRecommended, adapterSponsored, adapterMusic, adapterPopular, adapterTop;

    //Arrays for the title and image of each item in the event scroller
    private int[] upcomingImages = new int[]{R.drawable.toy_story_4_icon, R.drawable.litter, R.drawable.avatar, R.drawable.write, R.drawable.ted, R.drawable.cocktail, R.drawable.pie};
    private String[] upcomingTitles = new String[]{"Toy Story 4", "Litter pick", "Avatar 2", "Writing Club", "TED Talk BU", "Cocktail making", "Pie eating contest"};
    private int[] eventIDs = new int[]{10,16,17,18,19,20,21};

    private int[] nearbyImages = new int[]{R.drawable.beach, R.drawable.church, R.drawable.library, R.drawable.bloom, R.drawable.surf, R.drawable.arrow, R.drawable.bournemouth_fc_logo};
    private String[] nearbyTitles = new String[]{"BU Beach party", "BU Church", "Library reading", "Bloom", "BU Surf club", "Red arrows", "AFC Bournemouth"};
    private int[] nearbyIDs = new int[]{22,23,24,25,26,27,28};

    private int[] recommendedImages = new int[]{R.drawable.toy_story_4_icon, R.drawable.reading_festival_icon, R.drawable.bournemouth_fc_logo, R.drawable.basketball_icon, R.drawable.board_game_cafe_icon, R.drawable.sand_sculpture_logo, R.drawable.church};
    private String[] recommendedTitles = new String[]{"Toy Story 4", "Reading festival", "AFC Bournemouth", "Basketball", "Board game cafe", "Sand sculptures", "BU Church"};
    private int[] recommendedIDs = new int[]{10,11,12,13,14,15,23};

    private int[] sponsoredImages = new int[]{R.drawable.gold, R.drawable.gucci, R.drawable.coke, R.drawable.holiday, R.drawable.car, R.drawable.cruise, R.drawable.plane};
    private String[] sponsoredTitles = new String[]{"Gold5Cash", "Buy Gucci", "Drink coke", "Cheap holidays", "Car insurance", "Cruises", "Cheap flights"};
    private int[] sponsoredIDs = new int[]{10,11,12,13,14,15,20};

    private int[] musicImages = new int[]{R.drawable.bu_ball, R.drawable.music_learn, R.drawable.music1, R.drawable.music3, R.drawable.music4, R.drawable.reading_festival_icon, R.drawable.singing};
    private String[] musicTitles = new String[]{"BU Summer Ball", "Music festival", "BU orchestra", "Old Sound", "Sound of Music", "Reading festival", "Singers"};
    private int[] musicIDs = new int[]{10,11,12,13,14,15,21};

    private int[] popularImages = new int[]{R.drawable.bgt, R.drawable.coffee, R.drawable.club, R.drawable.grandnational, R.drawable.boxing, R.drawable.george, R.drawable.world};
    private String[] popularTitles = new String[]{"BGT", "Coffee morning", "Club night", "Grand national", "Tyson vs Tyler", "St George's day", "World to town"};
    private int[] popularIDs = new int[]{10,11,12,13,14,15,22};

    private int[] topImages = new int[]{R.drawable.top, R.drawable.zoo, R.drawable.mayday, R.drawable.fish, R.drawable.board_game_cafe_icon, R.drawable.firework, R.drawable.sand_sculpture_logo};
    private String[] topTitles = new String[]{"City views", "Zoo day", "May day fair", "Aquarium", "Aquarium", "Fireworks", "Sand sculptures"};
    private int[] topIDs = new int[]{10,11,12,13,14,15,24};

    private Hashtable<RecyclerView,int[]> viewImageTable  = new Hashtable<>();



    private ImageButton btnOpenNav;
    private ImageButton btnOpenSettings;

    private NavigationView navView;
    private DrawerLayout drawLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upcomingView = findViewById(R.id.upcoming_events_recycler);
        nearbyView = findViewById(R.id.nearby_events_recycler);
        recommendedView = findViewById(R.id.recommended_events_recycler);
        sponsoredView = findViewById(R.id.sponsored_events_recycler);
        popularView = findViewById(R.id.popular_events_recycler);
        top10View = findViewById(R.id.top10_events_recycler);
        newView = findViewById(R.id.new_events_recycler);

        List<RecyclerView> viewList = Arrays.asList(upcomingView, nearbyView, recommendedView, sponsoredView, popularView, top10View, newView);

        adapterUpcoming = new EventAdapter(this, getEvents("upcoming"));
        adapterNearby = new EventAdapter(this, getEvents("nearby"));
        adapterRecommended = new EventAdapter(this, getEvents("recommended"));
        adapterSponsored = new EventAdapter(this, getEvents("sponsored"));
        adapterMusic = new EventAdapter(this, getEvents("music"));
        adapterPopular = new EventAdapter(this, getEvents("popular"));
        adapterTop = new EventAdapter(this, getEvents("top"));
        ArrayList<EventAdapter> adapters = new ArrayList<>();
        adapters.add(adapterUpcoming);
        adapters.add(adapterNearby);
        adapters.add(adapterMusic);
        adapters.add(adapterRecommended);
        adapters.add(adapterSponsored);
        adapters.add(adapterPopular);
        adapters.add(adapterTop);


        //for each RecycleView map to a list of id's
        viewImageTable.put(upcomingView,eventIDs);
        viewImageTable.put(nearbyView,nearbyIDs);
        viewImageTable.put(recommendedView, sponsoredIDs );
        viewImageTable.put(sponsoredView, recommendedIDs);
        viewImageTable.put(popularView,popularIDs );
        viewImageTable.put(top10View,topIDs);
        viewImageTable.put(newView,musicIDs);

        int count = 0;
        for(RecyclerView view: viewList){
            view.setAdapter(adapters.get(count));
            view.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
            addListener(view);
            count++;
        }

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_login:
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(MainActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        startActivity(new Intent(MainActivity.this, GroupChatsActivity.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(MainActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_my_events:
                        startActivity(new Intent(MainActivity.this, MyEventsActivity.class));
                        break;
                    /*case R.id.nav_browse_events:
                        startActivity(new Intent(MainActivity.this, BrowseEventsActivity.class));
                        break;
                    case R.id.nav_advanced_search:
                        startActivity(new Intent(MainActivity.this, AdvancedSearchActivity.class));
                        break;
                    */
                    case R.id.nav_calendar:
                        startActivity(new Intent(MainActivity.this, CalendarActivity.class));
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
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<EventModel> getEvents(String event){
        ArrayList<EventModel> events = new ArrayList<>();

        switch(event) {
            case "upcoming":
                for (int i = 0; i < upcomingImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(upcomingTitles[i]);
                    EventModel.setImage_drawable(upcomingImages[i]);
                    events.add(EventModel);
                }
                break;
            case "nearby":
                for (int i = 0; i < nearbyImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(nearbyTitles[i]);
                    EventModel.setImage_drawable(nearbyImages[i]);
                    events.add(EventModel);
                }
                break;
            case "recommended":
                for (int i = 0; i < recommendedImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(recommendedTitles[i]);
                    EventModel.setImage_drawable(recommendedImages[i]);
                    events.add(EventModel);
                }
                break;
            case "sponsored":
                for (int i = 0; i < sponsoredImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(sponsoredTitles[i]);
                    EventModel.setImage_drawable(sponsoredImages[i]);
                    events.add(EventModel);
                }
                break;
            case "music":
                for (int i = 0; i < musicImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(musicTitles[i]);
                    EventModel.setImage_drawable(musicImages[i]);
                    events.add(EventModel);
                }
                break;
            case "popular":
                for (int i = 0; i < popularImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(popularTitles[i]);
                    EventModel.setImage_drawable(popularImages[i]);
                    events.add(EventModel);
                }
                break;
            case "top":
                for (int i = 0; i < topImages.length; i++) {
                    EventModel EventModel = new EventModel();
                    EventModel.setName(topTitles[i]);
                    EventModel.setImage_drawable(topImages[i]);
                    events.add(EventModel);
                }
                break;
        }
        return events;
    }
    private void addListener(RecyclerView view) {
        final int[] idList = viewImageTable.get(view);
        view.addOnItemTouchListener(
            new RecyclerItemClickListener(this, view, new RecyclerItemClickListener.OnItemClickListener() {

                @Override
                public void onItemClick(View view, int position) {
                    Intent intent = new Intent(MainActivity.this, ViewEventActivity.class);
                    intent.putExtra(EXTRA_POS, idList[position] );
                    startActivity(intent);
                }

                @Override
                public void onLongItemClick(View view, int position) {
                    // Long click
                }
            })
        );
    }
}
