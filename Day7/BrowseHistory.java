package day7;

public class BrowseHistory 
{
	private String URLs;

	public String getURLs() {
		return URLs;
	}

	public void setURLs(String uRLs) {
		URLs = uRLs;
	}
	public String getName() 
	{
		return URLs;
	}
	
	public BrowseHistory(String uRLs) {
		super();
		URLs = uRLs;
	}

	@Override
	public String toString() {
		return "BrowseHistory [URLs=" + URLs + "]";
	}
}
