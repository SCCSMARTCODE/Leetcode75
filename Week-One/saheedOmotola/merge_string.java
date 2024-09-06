class Solution {
    public String mergeAlternately(String word1, String word2) {
    	
        int m = word1.length(), n = word2.length();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < m || i < n; ++i) {
	            if (i < m) {
	                sb.append(word1.charAt(i));
	            }
	            if (i < n) {
	                sb.append(word2.charAt(i));
	            }
	        }
	        return sb.toString();        
    }
}
