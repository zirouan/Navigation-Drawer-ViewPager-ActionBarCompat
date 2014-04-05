package br.liveo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import br.liveo.navigationliveoviewpager.R;
import br.liveo.utils.Menus;

public class FragmentTabOne extends Fragment{

	private TextView txtFragmentone;
	    
    public static FragmentTabOne newInstance() {
        FragmentTabOne fragment = new FragmentTabOne();
        return fragment;
    }	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			
		View rootView = inflater.inflate(R.layout.fragmentone, container, false);
		txtFragmentone = (TextView) rootView.findViewById(R.id.txtFragmentOne);
		txtFragmentone.setText(R.string.fragment_tab_one);

		rootView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT ));		
		return rootView;
	}
			
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);		
		inflater.inflate(R.menu.menu, menu);
					    	   	    
		menu.findItem(Menus.ADD).setVisible(false);
		menu.findItem(Menus.UPDATE).setVisible(false);		
		menu.findItem(Menus.SEARCH).setVisible(true);		
	}	
}


