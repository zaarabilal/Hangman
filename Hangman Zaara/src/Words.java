public class Words {
	public String [] wordList;
	private String answer;
	public String dash;
	
	
	
	public Words() 
	{
		
		wordList= new String[20];
		wordList[0]= "SALMON";
		wordList[1]="LIME";
		wordList[2]="TURQUOISE";
		wordList[3]="AQUAMARINE";
		wordList[4]="MAROON";
		wordList[5]="MAGENTA";
		wordList[6]="SCARLET";
		wordList[7]="BEIGE";
		wordList[8]="CYAN";
		wordList[9]="INDIGO";
		wordList[10]="CORAL";
		wordList[11]="FUCHSIA";
		wordList[12]="EMERALD";
		wordList[13]="VIOLET";
		wordList[14]="TEAL";
		wordList[15]="DANDELION";
		wordList[16]="APRICOT";
		wordList[17]="MAHOGANY";
		wordList[18]="LAVENDER";
		wordList[19]="CERULEAN";
		answer=getWord();
		dash= "";
		setDisplayWord();
		
	}
	
	public int getRandom() {
	return (int)(Math.random()*(wordList.length-1-0+1))+0;
	}
	
	public String getWord() {
		System.out.println(wordList[getRandom()]);
		return wordList[getRandom()];
	}
		
	public String getAnswer() {
		return answer;
	}
	


	public void setDisplayWord() {
		for (int i=0; i<answer.length(); i++) {
			dash+="-";
			
				
			
			
		}
		
	}
	
	
	
	public String getDash() {
		return dash;
	}
		
	public boolean checkGuess(char c) {
		boolean guess= false;
		for (int i=0; i<answer.length(); i++) {
			
	
				if(answer.charAt(i)==c) {
					dash= dash.substring(0,i)+c+dash.substring(i+1);
					guess=true;	
					
			}	
				
		
		}
		
		return guess;
		
	}
	

}


