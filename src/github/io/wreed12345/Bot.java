package github.io.wreed12345;

public class Bot
{
	private final String ID;
	private MessageSender messageSender;
	
	public Bot(String ID)
	{
		this.ID = ID;
		messageSender = new MessageSender();
	}
	
	/**
	 * Sends a message to this bots group 
	 * @param message Text to send
	 */
	public void sendTextMessage(String message)
	{
		messageSender.sendTextMessage(message, ID);
	}
	
	/**
	 * Sends an image to this bots group along with text if desired
	 * @param text Text to send if any
	 * @param imageURL URL to the image to send
	 */
	public void sendImage(String text, String imageURL)
	{
		messageSender.sendImage(text, imageURL, ID);
	}
	
	/**
	 * Sends a location to the group
	 * @param text Text to send with the location
	 * @param latitude
	 * @param longitude
	 * @param name the name of the location
	 */
	public void sendLocation(String text, double latitude, double longitude, String name)
	{
		messageSender.sendLocation(text, name, longitude, latitude, ID);
	}
	
	/**
	 * Gets the ID of this bot
	 * @return the ID
	 */
	public String getID()
	{
		return ID;
	}
}
