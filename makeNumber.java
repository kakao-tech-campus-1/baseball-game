	public List<Integer> getInput(){
       		Scanner sc = new Scanner(System.in);
        	int input=sc.nextInt();
        	List<Integer> inputList= new ArrayList<>();
        	int a = input / 1000 % 10;
        	int b = input / 100 % 10;
        	int c = input / 10 % 10;
        	int d = input  % 10;
        	inputList.add(a);
        	inputList.add(b);
        	inputList.add(c);
        	inputList.add(d);
        	return inputList;
    	}

