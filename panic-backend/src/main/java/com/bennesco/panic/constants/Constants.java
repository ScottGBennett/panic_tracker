package com.bennesco.panic.constants;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constants {
	private Constants() {
	}

	private static final Set<String> excludedWordsList = Stream.of("a", "about", "above", "across", "after",
			"afterwards", "again", "against", "all", "almost", "alone", "along", "already", "also", "although",
			"always", "am", "among", "amongst", "amoungst", "an", "and", "another", "any", "anyhow", "anyone",
			"anything", "anyway", "anywhere", "are", "around", "as", "at", "be", "became", "because", "been", "before",
			"beforehand", "behind", "being", "below", "beside", "besides", "between", "beyond", "both", "but", "by",
			"can", "cannot", "could", "dare", "despite", "did", "do", "does", "done", "down", "during", "each", "eg",
			"either", "else", "elsewhere", "enough", "etc", "even", "ever", "every", "everyone", "everything",
			"everywhere", "except", "few", "first", "for", "former", "formerly", "from", "further", "furthermore",
			"had", "has", "have", "he", "hence", "her", "here", "hereabouts", "hereafter", "hereby", "herein",
			"hereinafter", "heretofore", "hereunder", "hereupon", "herewith", "hers", "herself", "him", "himself",
			"his", "how", "however", "i", "ie", "if", "in", "indeed", "inside", "instead", "into", "is", "it", "its",
			"itself", "last", "latter", "latterly", "least", "less", "lot", "lots", "many", "may", "me", "meanwhile",
			"might", "mine", "more", "moreover", "most", "mostly", "much", "must", "my", "myself", "namely", "near",
			"need", "neither", "never", "nevertheless", "next", "no", "nobody", "none", "noone", "nor", "not",
			"nothing", "now", "nowhere", "of", "off", "often", "oftentimes", "on", "once", "one", "only", "onto", "or",
			"other", "others", "otherwise", "ought", "our", "ours", "ourselves", "out", "outside", "over", "per",
			"perhaps", "rather", "re", "same", "second", "several", "shall", "she", "should", "since", "so", "some",
			"somehow", "someone", "something", "sometime", "sometimes", "somewhat", "somewhere", "still", "such",
			"than", "that", "the", "their", "theirs", "them", "themselves", "then", "thence", "there", "thereabouts",
			"thereafter", "thereby", "therefore", "therein", "thereof", "thereon", "thereupon", "these", "they",
			"third", "this", "those", "though", "through", "throughout", "thru", "thus", "to", "together", "too", "top",
			"toward", "towards", "under", "until", "up", "upon", "us", "used", "very", "via", "was", "we", "well",
			"were", "what", "whatever", "when", "whence", "whenever", "where", "whereafter", "whereas", "whereby",
			"wherein", "whereupon", "wherever", "whether", "which", "while", "whither", "who", "whoever", "whole",
			"whom", "whose", "why", "whyever", "will", "with", "within", "without", "would", "yes", "yet", "you",
			"your", "yours", "yourself", "yourselves", "aren't", "can't", "didn't", "don't", "doesn't", "hadn't",
			"hasn't", "haven't", "isn't", "mustn't", "needn't", "shouldn't", "wasn't", "weren't", "won't", "wouldn't",
			"let's", "i'm", "i'll", "i've", "i'd", "she'll", "he'll", "she's", "he's", "she'd", "he'd", "you're",
			"you'll", "you'd", "you've", "we're", "we'll", "we'd", "we've", "they'll", "they're", "they'd", "they've",
			"it's", "it'll", "it'd", "there'll", "there's", "there've", "that's", "that'd", "that'll")
			.collect(Collectors.toSet());

	public static Set<String> getExcludedWordsList() {
		return excludedWordsList;
	}

}
