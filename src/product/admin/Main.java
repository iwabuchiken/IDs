package product.admin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import product.id1.location.manager.*;
//import tut.various.samples.R;

public class Main extends Activity {

	// List of activities
	private Object[] activities = {
			"IDsActivity",					IDsActivity.class
	};//private Object[] activities
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		// super
		super.onCreate(savedInstanceState);
		
		// Set the content
		setContentView(R.layout.id1);
		
		// Prepare char sequence
        CharSequence[] list = new CharSequence[activities.length / 2];
        
        // Set chars to the list
        for (int i = 0; i < list.length; i++) {
			list[i] = (String)activities[i * 2];
		}//for (int i = 0; i < list.length; i++)
        
        // Define the adapter
         ArrayAdapter adapter	= new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
		
         // Get the list view
         ListView listView = (ListView) findViewById(R.id.activities_list);
		
         // Set the adapter to the view
         listView.setAdapter(adapter);
         
	}//public void onCreate(Bundle savedInstanceState)
}
