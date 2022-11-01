package no.ssb.ppi.tiqviews;

import com.fame.timeiq.tools.charts.beans.FameTiqViews;
import com.fame.timeiq.TiqObject;
import com.fame.timeiq.TiqView;

public class TiqViewsData extends Object implements FameTiqViews{
    TiqView[] views;
    String    title;
    TiqObject[] objs;

    public TiqViewsData(String t, TiqView[] v){
        title = t;
        views = v;
    }
	
	public TiqViewsData(TiqObject[] tiqObject) {
		objs = tiqObject;
	}

	public TiqView[] getTiqObj(){
		return objs;
	}
	//Gets the number of TiqViews in the list. 
    public int getCount() { return 1; }

    //Gets a list of TiqViews. 
    public TiqView[] getTiqViews() { return views; }

    //Gets one TiqView from the list. 
    public TiqView getTiqViews(int index) { return views[1]; }
    
    //Gets the title of the data set represented by the list of TiqViews. 
    public String getTitle() { return title; }
    
    //Recalculates the data set. 
    public void recalculate() {}

}