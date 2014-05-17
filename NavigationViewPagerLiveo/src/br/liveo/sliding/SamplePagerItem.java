package br.liveo.sliding;

import android.support.v4.app.Fragment;
import br.liveo.fragments.TabOneFragment;
import br.liveo.fragments.TabThreeFragment;
import br.liveo.fragments.TabTwoFragment;

public class SamplePagerItem {
	
	private final CharSequence mTitle;
    private final int mIndicatorColor;
    private final int mDividerColor;
    private final int position;
        
    private Fragment[] listFragments;
    public SamplePagerItem(int position, CharSequence title, int indicatorColor, int dividerColor) {
        this.mTitle = title;
        this.position = position;
        this.mIndicatorColor = indicatorColor;
        this.mDividerColor = dividerColor;
        
        listFragments = new Fragment[] {TabOneFragment.newInstance(), TabTwoFragment.newInstance(), TabThreeFragment.newInstance()};        
    }

    public Fragment createFragment() {
		return listFragments[position];
    }

    public CharSequence getTitle() {
        return mTitle;
    }

    public int getIndicatorColor() {
        return mIndicatorColor;
    }

    public int getDividerColor() {
        return mDividerColor;
    }
}
