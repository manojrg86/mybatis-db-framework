package com;

import java.util.ArrayList;
import java.util.List;

import com.db.DBDataHarness;
import com.entity.OnlineOrderContainer;

public class DataRetriever {

	public static void main(String[] args) {
		List<String> mapperArray = new ArrayList<String>();
		mapperArray.add("com.oms.sql.OnlineOrder.selectOnlineOrder");
		List<OnlineOrderContainer> onlineOrderList=new DBDataHarness().prepare(mapperArray);
	}

}
