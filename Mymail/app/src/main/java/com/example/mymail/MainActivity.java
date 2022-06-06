package com.example.mymail;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<EmailData> mEmailData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(R.string.app_name);
        mRecyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                DividerItemDecoration.VERTICAL));

        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        EmailData mEmail = new EmailData("Twitch", "Live Stream notification",
                "Long is streaming right now",
                "10:42am");
        mEmailData.add(mEmail);
        mEmail = new EmailData("Facebook", "Long, you have 1 new notification",
                "A lot has happened on Facebook since",
                "16:04pm");
        mEmailData.add(mEmail);
        mEmail = new EmailData("Google+", "Top suggested Google+ pages for you",
                "Top suggested Google+ pages for you",
                "18:44pm");
        mEmailData.add(mEmail);
        mEmail = new EmailData("Twitter", "Follow T-Mobile, Samsung Mobile U",
                "Long, some people you may know",
                "20:04pm");
        mEmailData.add(mEmail);
        mEmail = new EmailData("Pixiv", "New Fanbox post",
                "You have new unread posts",
                "09:04am");
        mEmailData.add(mEmail);
        mEmail = new EmailData("Pham Trung", "Rapxiec", "Abcdxyz",
                "01:04am");
        mEmailData.add(mEmail);

        MailAdapter mMailAdapter = new MailAdapter(MainActivity.this, mEmailData);
        mRecyclerView.setAdapter(mMailAdapter);

    }
}