package com.billa.prasanna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServlet;

public class CountryService {
	
	private static HashMap<Integer, Country> countryIdMap = getCountryIdMap();
	
	public CountryService() {
		if(countryIdMap==null) {
			countryIdMap = new HashMap<Integer, Country>();
			//creating objects while initializing
			countryIdMap.put(1, new Country(1,"Inida",10000));
			countryIdMap.put(4, new Country(4,"Australia",8000));
			countryIdMap.put(2, new Country(2,"China",15000));
			countryIdMap.put(3, new Country(3,"USA",6000));
			
		}
	}
	
	public List<Country> getAllConutries() {
		List<Country> countries = new ArrayList<Country>(countryIdMap.values());
		return countries;
	}
	
	public Country getCountryId(int id) {
		Country country = countryIdMap.get(id);
		return country;
	}
	
	public Country addCountry(Country country) {
		countryIdMap.put(countryIdMap.size()+1, country);
		return country;
	}
	
	public Country updateCountry(Country country) {
		if(country.getId()<=0) {
			return null;
		}
		countryIdMap.put(country.getId(), country);
		return country;
	}
	
	 public int deleteCountry(int id)
	 {
	  countryIdMap.remove(id);
	  return id;
	 }
	
	public static HashMap<Integer, Country> getCountryIdMap() {
		  return countryIdMap;
		 }
	
/*	public static void main(String[] args) {
		Country country = new CountryService().getCountryId(1);
		System.out.println(country.toString());
	}*/
}
