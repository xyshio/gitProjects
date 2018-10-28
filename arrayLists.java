//Sorting ArrayLists
List<String> numList = new ArrayList<>();
numList.add("500");
numList.add("10");
numList.add("9");
numList.add("50");
numList.add("40");

System.out.println(numList);

int index = Collections.binarySearch(numList, "10");
System.out.println(index);

Collections.sort(numList);
System.out.println(numList);
index = Collections.binarySearch(numList, "10");
System.out.println(index);

List<Integer> numbers = Arrays.asList(5,4,8,10,11,7,3);
System.out.println(numbers);

index = Collections.binarySearch(numbers, 7);
System.out.println(index);
Collections.sort(numbers);
System.out.println(numbers);

index = Collections.binarySearch(numbers, 7);
System.out.println(index);

/*
//// -- output
[500, 10, 9, 50, 40]
-1
[10, 40, 50, 500, 9]
0
[5, 4, 8, 10, 11, 7, 3]
-3
[3, 4, 5, 7, 8, 10, 11]
3

 */