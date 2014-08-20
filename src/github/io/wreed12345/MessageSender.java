package github.io.wreed12345;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MessageSender
{
	private final String REQUEST_URL = "https://api.groupme.com/v3/bots/post";

	public void sendTextMessage(String message, String botID)
	{
		String urlParameters = "bot_id=" + botID + "&text=" + message + "&param3=c";
		try
		{
			URL url = new URL(REQUEST_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);

			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			connection.disconnect();

			int responseCode = connection.getResponseCode();
			if (responseCode != 202)
				System.out.println(responseCode + " error has occured while sending the message: " + message);
		} catch (MalformedURLException e)
		{
			System.out.println("Error occured while establishing a connection");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.out.println("Error occured while sending data");
			e.printStackTrace();
		}
	}

	public void sendImage(String text, String imageURL, String botID)
	{
		try
		{
			String urlParameters = "{\"bot_id\":\"" + botID + "\",\"text\":\"" + text
					+ "\",\"attachments\":[{\"type\":\"image\",\"url\":\"" + imageURL + "\"}]}";
			String request = "https://api.groupme.com/v3/bots/post";
			URL url = new URL(request);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);

			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			connection.disconnect();

			int responseCode = connection.getResponseCode();
			if (responseCode != 202)
				System.out.println(responseCode + " error has occured while sending the image: " + imageURL);
		} catch (MalformedURLException e)
		{
			System.out.println("Error occured while establishing a connection");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.out.println("Error occured while sending data");
			e.printStackTrace();
		}
	}

	public void sendLocation(String text, String locationName, double longitude, double latitude, String botID)
	{
		try
		{
			String urlParameters = "{\"bot_id\":\"" + botID + "\",\"text\":\"" + text +"\",\"attachments\":[{\"type\":\"location\",\"lng\":\"" 
					+ longitude +"\",\"lat\":\"" + latitude + "\",\"name\":\"" + locationName +"\"}]}";
			String request = "https://api.groupme.com/v3/bots/post";
			URL url = new URL(request);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);

			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			connection.disconnect();

			int responseCode = connection.getResponseCode();
			if (responseCode != 202)
				System.out.println(responseCode + " error has occured while sending the location: " + latitude + " " + longitude);
		} catch (MalformedURLException e)
		{
			System.out.println("Error occured while establishing a connection");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.out.println("Error occured while sending data");
			e.printStackTrace();
		}
	}
}
