class Solution {
	/** removes duplicate symbols in a string
	 * @param str the given string
	 * @return a string with duplicate characters removed
	 */
	public static String removeDuplicateSymbols(String str) {
        //put your code here
        StringBuilder output = new StringBuilder();
        boolean duplicate = false;
        for (int i = 0; i < str.length(); i++) {
            duplicate = false;
            for (int j = i - 1; j >= 0 ; j--) {
                if(str.charAt(i) == str.charAt(j)){
                    duplicate = true;
                }
            }
            if(!duplicate){
                output.append(str.charAt(i));
            }
        }
        String s = output.toString();
        return s;
    }
}