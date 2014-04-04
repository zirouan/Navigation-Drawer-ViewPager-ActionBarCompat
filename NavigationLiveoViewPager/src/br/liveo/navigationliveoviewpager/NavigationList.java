package br.liveo.navigationliveoviewpager;

import android.content.Context;
import br.liveo.adapter.NavigationAdapter;
import br.liveo.adapter.NavigationItemAdapter;
import br.liveo.utils.Utils;

public class NavigationList {
	
	public static NavigationAdapter getNavigationAdapter(Context context){
		
		NavigationAdapter navigationAdapter = new NavigationAdapter(context);		
		String[] menuItems = context.getResources().getStringArray(R.array.nav_menu_items);
		
		for (int i = 0; i < menuItems.length; i++) {
			
			String title = menuItems[i];				
			NavigationItemAdapter itemNavigation;				
			itemNavigation = new NavigationItemAdapter(title, Utils.iconNavigation[i]);									
			navigationAdapter.addItem(itemNavigation);
		}		
		return navigationAdapter;			
	}	
}
