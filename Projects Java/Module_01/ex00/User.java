package Module_01.ex00;
import java.util.UUID;

public class User
{
	String name;
	UUID ID;
	int balance;

	public User(String name, int balance)
	{
		this.ID = UUID.randomUUID();
		this.name = name;
		this.balance = balance;
	}

	public User()
	{
		this.ID = UUID.randomUUID();
	}

	// Getters
	public String getName()
	{
		return name;
	}

	public UUID getID()
	{
		return ID;
	}

	public int getBalance()
	{
		return balance;
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}
}
