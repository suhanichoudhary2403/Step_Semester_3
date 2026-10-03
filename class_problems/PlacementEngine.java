import java.util.Arrays;
class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;
    double compositeScore;
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
        this.compositeScore = (cgpa * 10) + codingScore;
    }
    public int compareTo(Candidate other) {
        if (this.compositeScore < other.compositeScore) {
            return 1;
        } else if (this.compositeScore > other.compositeScore) {
            return -1;
        }
        return 0;
    }
}
public class PlacementEngine {
    public static boolean isEligible(double cgpa) {
        return cgpa >= 8.0;
    }
    public static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }
    public static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] qualified = new Candidate[candidates.length];
        int count = 0;
        for (int i = 0; i < candidates.length; i++) {
            Candidate c = candidates[i];
            if (isEligible(c.cgpa) || isEligible(c.cgpa, c.codingScore)) {
                qualified[count] = c;
                count++;
            }
        }
        Candidate[] shortlisted = Arrays.copyOf(qualified, count);
        Arrays.sort(shortlisted);
        String result = "";
        for (int i = 0; i < shortlisted.length; i++) {
            Candidate c = shortlisted[i];
            result += (i + 1) + ". " + c.name + " (" + c.compositeScore + ")";
            if (i < shortlisted.length - 1) {
                result += " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Candidate[] batch = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(batch));
    }
}
