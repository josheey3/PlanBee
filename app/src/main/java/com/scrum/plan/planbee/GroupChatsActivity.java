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
import android.widget.ImageButton;

import java.util.ArrayList;

import static com.scrum.plan.planbee.MyEventsActivity.EXTRA_POS;

public class GroupChatsActivity extends AppCompatActivity {

    public static final String EXTRA_POS = "com.scrum.plan.planbee.IMG_POS";

    private ImageButton btnOpenNav, btnOpenSettings;
    private NavigationView navView;
    private DrawerLayout drawLayout;

    private RecyclerView chatsView;
    private ArrayList<ChatModel> chatsArrayList;
    private ChatAdapter adapter;

    private String[] chatTitles = new String[]{"Cinema crew", "Litter pickers",  "BU Climbing Club", "Paint balling", "Board game cafe", "Bournemouth University", "BPI group", "Chat 5", "Neam Tame", "The instruments", "Scrummers", "Team 11"};
    private int[] chatIcons = new int[]{R.drawable.chat_cinema, R.drawable.litter, R.drawable.chat_climbing, R.drawable.chat_paintballing, R.drawable.chat_board_game, R.drawable.chat_bu, R.drawable.chat_bpi, R.drawable.chat_default, R.drawable.chat_default, R.drawable.chat_trumpet, R.drawable.chat_scrum, R.drawable.chat_11};
    private String[] chatUpcoming = new String[]{"Odeon\nMarch 15th", "Redwood Park\n March 14th", "The Project\nMarch 8th", "BU Paintball\nMarch 22nd", "", "", "Talbot Campus\nMarch 3rd", "", "", "", "", "Talbot Campus\nMarch 5th"};
    private int[] chatIDs = new int[]{0,1,2,3,4,5,6,7,8,9,10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chats);

        navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem navItem) {
                int itemId = navItem.getItemId();
                switch (itemId) {
                    case R.id.nav_home:
                        startActivity(new Intent(GroupChatsActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_login:
                        startActivity(new Intent(GroupChatsActivity.this, LoginActivity.class));
                        break;
                    case R.id.nav_create_account:
                        startActivity(new Intent(GroupChatsActivity.this, CreateAccountActivity.class));
                        break;
                    case R.id.nav_group_chats:
                        //already open
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(GroupChatsActivity.this, MapActivity.class));
                        break;
                    case R.id.nav_browse_events:
                        startActivity(new Intent(GroupChatsActivity.this, MainActivity.class));
                        break;
                    case R.id.nav_calendar:
                        startActivity(new Intent(GroupChatsActivity.this, CalendarActivity.class));
                        break;
                    case R.id.nav_my_events:
                        startActivity(new Intent(GroupChatsActivity.this, MyEventsActivity.class));
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
                Intent intent = new Intent(GroupChatsActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        // Chats recycler
        chatsView = findViewById(R.id.chats_recycler);
        chatsArrayList = getChats();
        adapter = new ChatAdapter(this, chatsArrayList);
        chatsView.setAdapter(adapter);
        chatsView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        chatsView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, chatsView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(GroupChatsActivity.this, MessageListActivity.class);
                        //intent.putExtra(EXTRA_POS, chatIDs[position] );
                        intent.putExtra(EXTRA_POS, position );
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                })
        );
    }

    private ArrayList<ChatModel> getChats(){
        ArrayList<ChatModel> chats = new ArrayList<>();

        for(int i = 0; i < chatTitles.length; i++){
            ChatModel chatModel = new ChatModel();
            chatModel.setImage_drawable(chatIcons[i]);
            chatModel.setName(chatTitles[i]);
            chatModel.setUpcoming(chatUpcoming[i]);
            chats.add(chatModel);
        }
        return chats;
    }

}

