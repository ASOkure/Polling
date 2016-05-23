
public class ratingIssues {
	String[]topics;
	int[][]responses;
	int[]frequency;
	
	
	public ratingIssues(String[] politicalTopics, int[][]surveyResponses, int[]frequencyNumber )
	{
		topics = politicalTopics;
		responses = surveyResponses;
		frequency = frequencyNumber;
	}

	
	public void set(String[] politicalTopics)
	{
	 topics = politicalTopics;	
	}

public  String[] getTopics()
{
	
	return topics;
}
}
