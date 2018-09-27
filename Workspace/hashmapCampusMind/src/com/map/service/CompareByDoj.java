package com.map.service;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;

import com.map.entity.CampusMind;

public class CompareByDoj implements Comparator<Map.Entry<String,CampusMind>> {
    public int compare(Map.Entry<String,CampusMind> m1, Map.Entry<String,CampusMind> m2) {
    	return m1.getValue().getDoj().compareTo(m2.getValue().getDoj());
}
}
