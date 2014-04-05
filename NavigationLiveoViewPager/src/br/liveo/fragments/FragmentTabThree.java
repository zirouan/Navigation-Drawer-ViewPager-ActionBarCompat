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

public class FragmentTabThree extends Fragment{
	
	private TextView txtFragmentThree;
	
    public static FragmentTabThree newInstance() {
        Bundle bundle = new Bundle();

        FragmentTabThree fragment = new FragmentTabThree();
        fragment.setArguments(bundle);

        return fragment;
    }	
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			
		View rootView = inflater.inflate(R.layout.fragmentthree, container, false);
		
		txtFragmentThree = (TextView) rootView.findViewById(R.id.txtFragmentThree);
		txtFragmentThree.setText(R.string.fragment_tab_three);
		
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
		menu.findItem(Menus.UPDATE).setVisible(true);		
		menu.findItem(Menus.SEARCH).setVisible(false);		
	}
}


