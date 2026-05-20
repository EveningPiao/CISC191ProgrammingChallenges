package edu.sdmesa.cisc191;
 
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
 
/**
 * Lead Author(s):TianLin Zhao
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class:
 * Stores many search results (URLs) for each keyword, allowing multiple
 * URLs to be associated with a single keyword. 
 */
public class SearchEngine
{
	// Each keyword maps to a list of URLs (Strings).
	private Hashtable<String, ArrayList<String>> index;
 
	public SearchEngine()
	{
		index = new Hashtable<String, ArrayList<String>>();
	}
 
	/**
	 * Associates the given URL with the given keyword. 
	 * 
	 * @param keyword the search keyword
	 * @param url     the URL associated with the keyword
	 */
	public void add(String keyword, String url)
	{
		// Check if the keyword already exists in the map
		if (index.containsKey(keyword))
		{
			// If it exists, add the URL to the existing list
			index.get(keyword).add(url);
		}
		else
		{
			// Otherwise, create a new list for this keyword and add it to the map
			ArrayList<String> urls = new ArrayList<String>();
			urls.add(url);
			index.put(keyword, urls);
		}
	}
 
	/**
	 * Returns a list of URLs associated with the given keyword.
	 * 
	 * @param keyword the search keyword
	 * @return a copy of the list of URLs, or an empty list if none exist
	 */
	public List<String> search(String keyword)
	{
		if (index.containsKey(keyword))
		{
			// Return a copy of the list 
			return new ArrayList<String>(index.get(keyword));
		}
		// Return an empty list if the keyword is not present
		return new ArrayList<String>();
	}
 
}
