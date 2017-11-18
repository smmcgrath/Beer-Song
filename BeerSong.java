public class BeerSong{
	
	public static void main(String[] args){
		//setting the variables
		int beerNum = 99;
		String word = "bottles";

		//while loop iterates until condition becomes false i.e. beerNum is not greater that 0
		while(beerNum > 0){
			if (beerNum == 1){
				word = "bottle";
			}///end if condition
			
			//System.out.println will print a new line to the console
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down");
			System.out.println("Pass it around.");
			
			//ensure the bottle count is reduced by 1 on each iteratio
			beerNum = beerNum - 1;

			if (beerNum == 0){
				System.out.println("No more bottles of beer on the wall");
			}//end condition
		}//end while loop
	}//end main method
}//end class
