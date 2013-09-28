package com.manish.customlistview;

import java.util.ArrayList;

import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;
/**
 * 
 * @author manish
 *
 */

public class CustomListView extends Activity {
	ArrayList<Item> imageArry = new ArrayList<Item>();
	CustomImageAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// add image and text in arraylist
		String Video[]={"xyz","abcd"};
		String Song[]={"xyz","abcd","pqerttt","yuioo"};
		String Movi[]={"xyz","abcd","qwer","yuioo","tyyuu","ggggggg","yuioo","tyyuu","ggggggg"};
		
		imageArry.add(new Item(R.drawable.facebook, Song));
		imageArry.add(new Item(R.drawable.outlook, Video));
		imageArry.add(new Item(R.drawable.google, Movi));
		
		// add data in contact image adapter
		adapter = new CustomImageAdapter(this, R.layout.list, imageArry);
		ListView dataList = (ListView) findViewById(R.id.list);
		dataList.setAdapter(adapter);

	}

}
