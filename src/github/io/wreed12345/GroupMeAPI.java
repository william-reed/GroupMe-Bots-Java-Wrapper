package github.io.wreed12345;

public final class GroupMeAPI
{
	//just a test
	public static void main(String[] args)
	{
		Bot bot = new Bot("19f76e34578b8da260a59d3819");
		bot.sendTextMessage("Test message");
		bot.sendImage("Check out this image", "http://www.wtt.com/Pictures/WTT_logo_color_Jan2010.gif");
		bot.sendLocation("Home", 38.8977, -77.0366, "The White House");
	}
}
