	public List<Integer> makeNumber() {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		boolean isTrue = true;
		
		List<Integer> listArr = new ArrayList<>();
		int one = random.nextInt(10);
		listArr.add(one);
		
		for(;;) {
			int two = random.nextInt(10);
			if(listArr.get(0) == two) {
				continue;
			} else {
				listArr.add(two);
				break;
			}
		}
		
		int three = 0;
		for(;;) {
			isTrue = true;
			three = random.nextInt(10);
			for(int i=0; i<listArr.size(); i++) {
				if(listArr.get(i) == three) {
					isTrue = false;
					break;
				}
			}
			if(isTrue == false) {
				continue;
			}
			
				listArr.add(three);
				break;
		}
		
		
		int four = 0;
		for(;;) {
			isTrue = true;
			four = random.nextInt(10);
			for(int i=0; i<listArr.size(); i++) {
				if(listArr.get(i) == four) {
					isTrue = false;
					break;
				}
			}
			if(isTrue == false) {
				continue;
			}
				listArr.add(four);
				break;
		}
		return listArr;

	}

