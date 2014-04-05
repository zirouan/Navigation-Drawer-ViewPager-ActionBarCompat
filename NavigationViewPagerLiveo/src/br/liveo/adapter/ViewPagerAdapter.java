package br.liveo.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import br.liveo.sliding.SamplePagerItem;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	private List<SamplePagerItem> mTabs;
	public ViewPagerAdapter(FragmentManager fragmentManager, List<SamplePagerItem> mTabs) {
		super(fragmentManager);
		this.mTabs = mTabs;
	}

    @Override
    public Fragment getItem(int i) {
        return mTabs.get(i).createFragment();
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position).getTitle();
    }
}