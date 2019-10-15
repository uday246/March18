package May19;

public class StringBEx {
	public static void main(String[] args) {
		
		
		
		
		StringBuilder sb = new StringBuilder("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way-- in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only");
		sb=	replaceString(sb, "it", "Uday");
		sb=	replaceString(sb, "It", "Uday");
		sb=	replaceString(sb, ",", ":");
		System.out.println(sb);
			
	}

	public static StringBuilder replaceString(StringBuilder sb, String toReplace, String replacement) {
		int index = -1;
		while ((index = sb.lastIndexOf(toReplace)) != -1) {
			sb.replace(index, index + toReplace.length(), replacement);
		}
		return sb;
	}
}
