GroupMe Java API
==
The unofficial GroupMe API for Java


Example usage:
--
```java
Bot bot = new Bot("19f76e34578b8da260a59d3819");
bot.sendTextMessage("Test message");
bot.sendImage("Check out this image", "http://www.wtt.com/Pictures/WTT_logo_color_Jan2010.gif");
bot.sendLocation("Home", 38.8977, -77.0366, "The White House");
```

To Do
--
Feel free to add any of these by first forking this repository, create a branch with a name relevant to your addition then create a pull request describing your addition.
- Create a Bot Registrator
- Add a Bot.class method to change the bot name
- Perform message sending work on a seperate thread to prevent blocking
- Add some ability to listen for messages that are sent in the bots group
- Add the ability for the above on a seperate thread
- Anything else you can think of...

Contact
--
If you have any questions about using the API or contributing to it contact me on skype with the username wreed12345 or by emailing me at wreed58@gmail.com
