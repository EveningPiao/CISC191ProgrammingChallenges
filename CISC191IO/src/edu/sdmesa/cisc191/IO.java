package edu.sdmesa.cisc191;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

/**
* 
 * Lead Author(s):TianLin Zhao
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Gaddis, T. (2015). Starting out with Java: From control structures through objects. Addison-Wesley. 
 *  
 * Version/date: 5/16/2026
 * 
 * Responsibilities of class: 
 * Provides static methods to read and write such as reading
 * test results from a CSV file, creating/overwriting a results file,
 * appending results to a file, and reading date/time data from a URL.
 * 
 */
/**
 */
public class IO
{
	// Hint: close operations must happen in a finally clause.
 
	/**
	 * Reads the contents of the file with the given file name and returns
	 * its content as a single String. If the file does not exist, returns
	 * an empty String.
	 * 
	 * @param fileName the name of the file to read (including extension)
	 * @return the file's contents as a String, or "" if the file is not found
	 */
	public static String readTestResults(String fileName)
	{
		// Setup the file as a File object
		File myFile = new File(fileName);
 
		// Setup scanner
		Scanner scan = null;
 
		try
		{
			scan = new Scanner(myFile); // Create a Scanner object using the File object
			String content = ""; // Create a String to hold the content
 
			// Obtain content from the file as long as there is content to be obtained
			while (scan.hasNext())
			{
				content += scan.next(); // Grab the content of the file through the Scanner with its next method
			}
			// The loop ends once it has reached the end of the file.
			// Return the content that was built up.
			return content;
		}
		catch (FileNotFoundException e)
		{
			// This block of code runs if the file is not found
			// Return an empty String when there is no file to read
			return "";
		}
		finally
		{
			if (scan != null)
			{
				scan.close();
			}
		}
	}
 
	/**
	 * Creates (or overwrites) the given file and writes the provided content
	 * to it as the first line. Any prior contents of the file are lost.
	 * 
	 * @param fileName the name of the file to create/overwrite
	 * @param content  the content to write to the file
	 */
	public static void startTestResults(String fileName, String content)
	{
		try
		{
			// Create a PrintWriter object for a given filename
			PrintWriter outputFileWriter = new PrintWriter(fileName);
 
			// Anytime you want to "write" to the writer, use the println command
			outputFileWriter.println(content);
 
			// Once you are done "writing", close the file.
			outputFileWriter.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot write file. File will not be written.");
		}
	}
 
	/**
	 * Appends the provided content as a new line to the given file. If the
	 * file does not exist, it is created. Existing content is preserved.
	 * 
	 * @param fileName the name of the file to append to
	 * @param content  the content to append to the file
	 */
	public static void appendTestResult(String fileName, String content)
	{
		try
		{
			// Create a PrintWriter object for a given filename (append mode)
			PrintWriter outputFileWriter = new PrintWriter(new FileWriter(new File(fileName), true));
 
			// Write the content
			outputFileWriter.println(content);
 
			// Once you are done "writing", close the file.
			outputFileWriter.close();
		}
		catch (Exception e)
		{
			System.out.println("Cannot write file. File will not be written.");
		}
	}
 
	/**
	 * Reads data from the given URL and extracts the dateTime value from
	 * the returned JSON-like text. Returns the extracted timestamp String,
	 * or "" if any error occurs.
	 * 
	 * @param api the URL string to read from
	 * @return the dateTime value as a String, or "" on error
	 */
	public static String readDateTime(String api)
	{
		Scanner scan = null; // declare a Scanner object
 
		try
		{
			// Create a URL
			URL url = new URI(api).toURL();
 
			// Create a Scanner object
			scan = new Scanner(url.openStream());
 
			// Get the content line by line
			String content = "";
			while (scan.hasNext())
			{
				content += scan.next();
			}
 
			// Isolate only the dateTime value using substring.
			// Find the position of "dateTime" and extract the value between the quotes.
			final String KEY = "\"dateTime\":\"";
			int startIndex = content.indexOf(KEY);
			if (startIndex == -1)
			{
				return "";
			}
			startIndex += KEY.length(); // move past the key to the start of the value
			int endIndex = content.indexOf("\"", startIndex);
			if (endIndex == -1)
			{
				return "";
			}
			return content.substring(startIndex, endIndex);
		}
		catch (Exception e)
		{
			// the error 
			return "";
		}
		finally
		{
			if (scan != null)
			{
				scan.close();
			}
		}
	}
}