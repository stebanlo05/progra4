class VowelCounter {
    public static void main(String[] args) {
        String text = "Deportivo Pereira"; 
        int vowelCount = countVowels(text);
        System.out.println("Number of vowels in \"" + text + "\": " + vowelCount);
    }

    static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
