package amazonInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution3 {

	public static void main(String[] args) {
		// whatever we're looking for, we want a list in the end
		ArrayList<String> answer = new ArrayList<String>();
		List<String> competitors = new ArrayList<String>();
	

		//answer = topNCompetitors(5, 2, [anacell, betacellular, cetracular, deltacellular, eurocell], 3, [Best services provided by anacell, beta])
		//competitors.add(anacell);
		System.out.println("The Answer: " + answer);

	}

	public ArrayList<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
			int numReviews, List<String> reviews) {
		Map<String, Integer> termFrequency = new HashMap<>();
		// for each search term, use a hashmap to count the frequency of the term
		for (String competition : competitors) {
			termFrequency.compute(competition, (k, v) -> v == null ? 1 : v + 1);
		}
		// next, sort by frequency count; entry based on number of competitors
		ArrayList<String> findings = (ArrayList<String>) termFrequency.entrySet().stream()
				.filter(entry -> entry.getValue() == numCompetitors).map(entry -> entry.getKey()).collect(Collectors.toList());
		//reverse it
		Collections.reverse(findings);

		//return the top findings using a simple for loop
		ArrayList<String> topFindings = new ArrayList<String>();
		for (int i = 0; i < topNCompetitors; i++) {
			topFindings.add(i, findings.get(i));

		}

		return topFindings;

	}

}
