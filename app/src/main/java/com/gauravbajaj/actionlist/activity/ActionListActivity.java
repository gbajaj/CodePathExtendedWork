package com.gauravbajaj.actionlist.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gauravbajaj.actionlist.R;
import com.gauravbajaj.actionlist.fragment.ActionItemFragment;
import com.gauravbajaj.actionlist.fragment.ActionListFragment;


public class ActionListActivity extends AppCompatActivity implements ActionListFragment.OnFragmentInteractionListener, ActionItemFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_activity);
        //Set Action bar icon and show that
        getSupportActionBar().setIcon(R.drawable.check);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //setting default fragment in a ItemListActivity
        final FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        final ActionListFragment toDoFragment = new ActionListFragment();
        if (savedInstanceState == null) {
            fragmentTransaction.add(R.id.fragment_container, toDoFragment);
            fragmentTransaction.commit();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
