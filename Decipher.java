public class Decipher {
    private String input; 
    public Decipher(){
    }
    public void decrypt(String encrypted){
        int rails = 3;
        char[][] grid = new char[rails][encrypted.length()];
        int row1count = 0;
        int row2count = 1;
        int row3count = 2;
        int x = 0;
        int y = 0;
        String decrypted = "";
            for(x = 0; x < encrypted.length()/3 ; x++ ){
                for(int i = 0; i < 1; i ++){
                grid[0][row1count] = encrypted.charAt(x);
                row1count+=4;
            } 
        }
        for(y = 0; y < encrypted.length()/2; y++){
            grid[1][row2count] = encrypted.charAt(x+y);
                row2count+=2;
            } 
        
        for(int z = x + y; z < encrypted.length(); z++){
            grid[2][row3count] = encrypted.charAt(z);
                row3count+=4;
            } 
        for(int m = 0; m < encrypted.length(); m++){  
            for(int q = 0; q < 3; q++){
                if(grid[q][m] != 0){
                decrypted = decrypted + grid[q][m];
                }
            
            
            
    
            }
        }
        System.out.println(decrypted);
    }
    }

//}


 

