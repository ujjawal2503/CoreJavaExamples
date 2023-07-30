package interviewPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeStream {

    public static void main(String[] args) {
        /* 1:-- Given a list of integers, write a method to find the maximum number*/
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3042);
        numberList.add(3044);
        numberList.add(3045);
        numberList.add(3047);
        numberList.add(3048);
        numberList.add(3);
        numberList.add(-344);
        System.out.println("First way to find max----"+numberList.stream().max(Integer::compareTo).get());
        System.out.println("Second way to find max----"+numberList.stream().max(Comparator.naturalOrder()).get());

        /* 2:--Given a list of strings, write a method to find the average length of strings*/
        List<String> stringList = new ArrayList<>();
        stringList.add("ujjawal");
        stringList.add("ANkit");
        stringList.add("Suyash");
        stringList.add("Shruti");
        stringList.add("1234");

         int averageLength = (stringList.stream().mapToInt(String::length).sum()) / stringList.size();
        System.out.println("Method to find average length===="+averageLength);

        /* 4-----Given a list of integers, write a method to find the sum of the squares of all
even numbers*/
        List<Integer> numberList1 = Arrays.asList(4,5,6,7,1,2,3);
        int sumOfEvenSquare= numberList1.stream().filter(e->e%2==0).mapToInt(e->e*e).sum();
        System.out.println("Method to find square of even numbers --->"+ sumOfEvenSquare );

        /* 5---Given a list of strings, write a method to concatenate all strings into a single string*/
        List<String> stringList1 = Arrays.asList("Ujjawal  ","Raju  ","Kaju ","Himanshu");
        String bigString = String.join("", stringList1);
        System.out.println("Method to concatenate list of string together---->"+bigString);

        /*6---write a method to find the product of all numbers greater than 5*/
        List<Integer> numberList2 = Arrays.asList(4,5,6,1,10,2,9,1,2,6,33,7,8,49,47,15,30);
        int productOfAboveFive = numberList2.stream().filter(e->e>5).reduce(1, (a,b) -> a*b);
        System.out.println("Product of element above 5---"+productOfAboveFive);

        /*7-------- write a method to sort the strings in ascending order using Java 8 Stream*/
        List<String> sortedList = stringList1.stream().sorted(String::compareTo).toList();
        System.out.println(sortedList);

        /*8--- write a method to remove all duplicates and return a list of unique numbers */
       List<Integer> newUniqueList = numberList2.stream().distinct().collect(Collectors.toList());
        System.out.println(newUniqueList);

        /*9---Given a list of strings, write a method to convert all strings to uppercase*/
        List<String> list = Arrays.asList("David", "Tom", "Ken45","Yuvraj", "Gayle","eagle","eye","madam","UJJAWAL","SHRUTI");
        list.stream().map(String::toUpperCase) .forEach(System.out::println);

        /*10---Given a list of integers, write a method to check if all numbers are positive*/
        List<Integer> numberList3 = Arrays.asList(4,-5,6,31,-10,2,9,1,2);
        numberList3.stream().filter(e->e>-1).toList().forEach(System.out::println);

        /*11------Given a list of strings, write a method to find the shortest string */
         String s = list.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println("Shortest string--->"+s);
        int s1 = list.stream().map(String::length).min(Integer::compare).get();
        System.out.println("length of the Shortest string--->"+s1);

        /*12------Given a list of integers, write a method to find the average of all numbers */
        OptionalDouble sumAvg =  numberList2.stream().mapToInt(e->e).average();
        System.out.println("Average of sum of all elements --->"+sumAvg);

        /*.13----Given a list of strings, write a method to count the number of strings that have a length greater than a given value*/
        int countString = (int) list.stream().filter(e->e.length()>3).count();
        System.out.println("string count above 3 is ---"+countString);

        /*14-- Given a list of integers, write a method to find the second smallest number */
         Integer integer = numberList2.stream().sorted(Comparator.naturalOrder()).toList().get(1);
        System.out.println("Second smallest----"+integer);

        /*15----Given a list of strings, write a method to filter out all strings that contain a specific character*/
         List<String> returnList  = list.stream().filter(e -> e.contains("o")).toList();
        System.out.println("List containing o in it ------"+returnList);

         /*16--.Given a list of integers, write a method to find the sum of all numbers divisible by 3*/
         int sum = numberList2.stream().filter(e -> e % 3 == 0).mapToInt(e -> e).sum();
        System.out.println("Sum all numbers divisible by 3 --"+sum);

        /*.17 ---Given a list of strings, write a method to find the longest string */
         String longString = list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("Longest String ---->"+longString);

        /*18----Given a list of integers, write a method to check if any number is divisible by a given value*/
         List<Integer> collect = numberList2.stream().filter(e -> e % 3 == 0).toList();
        System.out.println("List of element divided by 3----"+collect);

        /*19--- .Given a list of strings, write a method to find the count of strings that start with a vowel */
       List<String> vowelList = list.stream().filter(e->(e.startsWith("a")||e.startsWith("e")||e.startsWith("i")
        ||e.startsWith("o")||e.startsWith("u"))).toList();
        System.out.println("List of element starting with Vowels"+vowelList);

        /*20---Given a list of integers, write a method to find the third largest number*/
        int thirdHighest = numberList2.stream().sorted().toList().get(2);
        System.out.println("thirdHighest number in the list =---->"+thirdHighest);

        /*21 ---Given a list of strings, write a method to filter out all strings that are palindromes using Java 8 Stream*/
         List<String> collect1 = list.stream().filter(e ->
                {  StringBuilder input1 = new StringBuilder();
                    input1.append(e);
                    input1.reverse();
                    return e.equals(input1.toString());
                }
        ).toList();
        System.out.println("Palindrome Strings ---->"+collect1);

        /*22---Given a list of integers, write a method to find the sum of all prime numbers*/
         List<Integer> collect2 = numberList2.stream().filter(integer1 -> {
        boolean flag = true;
             for (int i = 2; i <integer1 ; i++) {
                 if (integer1 % i == 0) {
                     flag = false;
                     break;
                 }
             }
             return flag;
        }).toList();
        System.out.println("Prime numbers ---"+collect2);

        /*23---Given a list of strings, write a method to reverse the order of the strings*/
         List<String> collect3 = list.stream().map(e -> {
            StringBuilder input1 = new StringBuilder();
            return input1.append(e).reverse().toString();
        }).toList();
        System.out.println("Reversing the order of strings--->"+collect3);

        /*24--Given a list of integers, write a method to find the average of positive numbers*/
        System.out.println("Average of positive numbers--->" +numberList3.stream().filter(integer1 -> integer1>-1).mapToInt(e->e).average().getAsDouble());

        /*25--Given a list of strings, write a method to find the count of strings that end with a specific character*/
         long count = list.stream().filter(e -> e.endsWith("e")).count();
        System.out.println("string ending with e count-----"+count);

        /*26--Given a list of integers, write a method to find the product of all numbers divisible by 4 */
       int product= numberList2.stream().filter(e->e%4==0).reduce(1,(a,b)->(a*b));
        System.out.println("product of element divisible by 4---"+product);

        /*27--Given a list of strings, write a method to find the count of strings that have an even length*/
         long countEven = list.stream().filter(e -> e.length() % 2 == 0).count();
        System.out.println("Count even length String"+countEven);

        /*28---Given a list of integers, write a method to check if all numbers are even*/
         List<Integer> collect4 = numberList2.stream().filter(integer1 -> integer1 % 2 == 0).toList();
        System.out.println("even number list ====="+collect4);

        /*29---Given a list of strings, write a method to find the count of strings that have an odd length*/
        long countOdd = list.stream().filter(e -> e.length() % 2 != 0).count();
        System.out.println("Count odd length String----"+countOdd);

        /*30---Given a list of integers, write a method to find the sum of all numbers between a given range*/
         List<Integer> collect5 = numberList2.stream().filter(e -> e > 10 && e < 50).toList();
        int sum1 = numberList2.stream().filter(e -> e > 10 && e < 50).mapToInt(e -> e).sum();
        System.out.println("sum of list between 10-50 ---"+collect5+"   "+sum1);

        /*31----.Given a list of strings, write a method to filter out all strings that have a length less than a given value*/
         List<String> collect6 = list.stream().filter(e -> e.length() < 8).toList();
        System.out.println("String with length less than 8 ---"+collect6);

        /*32--- Given a list of integers, write a method to check if the list contains any duplicate numbers */
        Set<Integer> items = new HashSet<>();
        Set<Integer> collect7 = numberList2.stream().filter(e -> !items.add(e)).collect(Collectors.toSet());
        System.out.println("Duplicate elements of the list ----"+collect7);

        /*33---Given a list of strings, write a method to find the count of strings that contain a specific substring*/
         long omCount = list.stream().filter(e -> e.contains("om")).count();
        System.out.println("String count containing OM---"+omCount);

        /*34---Given a list of integers, write a method to find the largest prime number*/
         Integer largestPrime = numberList2.stream().sorted().filter(integer1 -> {
            boolean flag = true;
            for (int i = 2; i < integer1; i++) {
                if (integer1 % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }).toList().get(0);
        System.out.println(" Question number 34---largest prime number from list --->"+largestPrime);

        /*35---Given a list of strings, write a method to check if all strings contain only uppercase letters*/
      List<String> upperCaseList =  list.stream().filter(e->{
          return e.matches("[A-Z]+");
      }).toList();
        System.out.println(" Question number 35 --- List of String with all characters with UpperCase--->"+upperCaseList);

        /* 36--Given a list of integers, write a method to find the count of numbers that are perfect squares*/
       List<Integer> sqreList =  numberList2.stream().filter(e->{
           return Math.sqrt(e) == (int) Math.sqrt(e);
       }).toList();
        System.out.println("Question number 36---List of perfect square---"+sqreList);

        /*37--Given a list of strings, write a method to filter out all strings that are numeric*/
         List<String> collect8 = list.stream().filter(e -> e.matches("[A-Za-z0-9]")).toList();
        System.out.println("String containing number---"+collect8);

        /*38--Given a list of integers, write a method to find the sum of the first N numbers*/
        int sumfive = numberList2.stream().limit(5).mapToInt(e->e).sum();
        System.out.println("Sum of first five elements"+sumfive);

        /*39---Given a list of strings, write a method to find the count of strings that contain only lowercase letters*/

         List<String> collect9 = list.stream().filter(e -> {
             return e.matches("[a-z]+");
         }).toList();
        System.out.println("List of small letter string---"+collect9);

        /*40--- Given a list of integers, write a method to find the count of numbers that are multiples of both 3 and 5*/

         List<Integer> collect10 = numberList2.stream().filter(e -> {
             return e % 3 == 0 && e % 5 == 0;
         }).toList();
        System.out.println("List of element divisible by 3 and 5 --->"+collect10);

        /*41--- Given a list of strings, write a method to filter out all strings that are not alphanumeric*/

        /*42--- Given a list of integers, write a method to find the count of numbers that are divisible by the sum of their digits*/
       List<Integer> listDivide = numberList2.stream().filter(e->{
            int temp=e;
            int sum11 =0;
                while(temp>0){
                    sum11=sum11+temp%10;
                    temp/=10;
                }
           return e % sum11 == 0;
       }).toList();
        System.out.println("Ques number 42:----> Number divisble by sum of its digit"+listDivide);

    /* 43---Given a list of strings, write a method to convert all strings to lowercase using Java 8 Stream API and lambda functions*/
      List<String> smallLetter =  list.stream().map(String::toLowerCase).toList();
        System.out.println("Ques number 43:----> All string in small letters"+smallLetter);


    /* 44  Given a list of integers, write a method to find the count of prime numbers using Java 8 Stream API and lambda functions*/
         long count1 = numberList.stream().filter(integer1 -> {
            boolean flag = true;
            for (int i = 2; i < integer1; i++) {
                if (integer1 % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }).count();
        System.out.println("Ques num 44---- Count of prime numbers---"+ count1);

        /*45:--- Given a list of strings, write a method to filter out all strings that have repeated characters */
        List<Character> charList = new ArrayList<>();
         List<String> listWithoutRepeatedCharString = stringList.stream()
                .filter(e -> {
                    return e.chars()
                            .mapToObj(c -> (char) c)
                            .distinct()
                            .count() == e.length();
                })
                .toList();

        System.out.println("Ques   45-------"+listWithoutRepeatedCharString);

        /*Given a list of integers, write a method to check if the list contains any negative numbers using Java 8 Stream API and lambda functions.*/
         long count2 = numberList.stream().filter(integer1 -> integer1 < 0).count();
         if(count2>0){
             System.out.println("question number 46 -----List is having negative numbers    "+count2);
         } else {
             System.out.println("question number 46 -----List is not having any negative number");
         }

        /*47---Given a list of strings, write a method to find the count of strings that contain only numeric characters */
         long onlyNumericStringCount = stringList.stream().filter(s2 -> s2.matches("\\d+")).count();

        System.out.println("Question number 47 -----  Count is    " +onlyNumericStringCount);

        /* 48 Given a list of integers, write a method to find the count of numbers that have an odd number of digits*/
         long count3 = numberList.stream()
                .filter(e -> String.valueOf(e).length() % 2 != 0)
                .count();
        System.out.println("Question number 48 -----  Count is  "+count3);

        /* 49 Given a list of strings, write a method to check if all strings are non-empty*/
        int sizeList = stringList.size();
         long count4 = stringList.stream().filter(String::isEmpty).count();
        System.out.println("Question number 49 -----  Count of empty string"+ count4);

        /* 50 Given a list of integers, write a method to find the count of numbers that are powers of 2 using Java 8 Stream API and lambda functions*/
         long count5 = numberList.stream()
                .filter(number -> (number > 0 && (number & (number - 1)) == 0))
                .count();
        System.out.println("Question num 50 count of number which falls in power of 2---"+count5);
        /* This check is done using a bitwise operation (number & (number - 1)) == 0.*/


    }




}
