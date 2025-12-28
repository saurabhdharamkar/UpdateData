import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayList {

    public static void main(String[] args) {

        List<Integer> intList=List.of(1,2,3,4,11,5,6,7,8,9);

        List<Integer> ascendingOrder;
        List<Integer> descendingOrder;

        ascendingOrder=intList.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);

        descendingOrder=intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingOrder);

        Optional<Integer> secondLarge=intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLarge.get());

        List<Integer> evenNumbers=intList.stream().filter(ele->ele%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> oddNumber=intList.stream().filter(ele->ele%2!=0).map(ele->ele+2).collect(Collectors.toList());
        System.out.println(oddNumber);

        int fibResult=intList.stream().filter(ArrayList::fibonoci).mapToInt(Integer::intValue).sum();
        System.out.println(fibResult);
    }

    public static boolean fibonoci(int num){
        int sum=0;
        sum+=num;
        return true;
    }

    /// Add this code to master via pull request

    //saurabh new

    //newly added
}
