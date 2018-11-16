public class Cipher{
    private String input; 
    public Cipher(String theinput){
        input = theinput;    
    }
    public void getInput(String theinput){
        input = theinput;
    }
    public String getInput(){
        return input;
    }
    public String encrypt(String key){
        key = key.replaceAll(" ","");
        int rails = 3;
        char[][] grid = new char[rails][key.length()];
        String row1 = "";
        String row2 = "";
        String row3 = "";
        for(int x = 0; x < key.length(); x++){
            if(x%4 == 0){
            grid[0][x] = key.charAt(x);
            }
            else if(x%4 == 1 || x%4 == 3){
                grid[1][x] = key.charAt(x);
            }
            else if(x%4 == 2){
                grid[2][x] = key.charAt(x);
            
            }
            for (int y = 0; y <3; y++){
                    if (grid[y][x] == 0){
                        grid[y][x] = '.';
                    }
                }
        }
    
        for(int i = 0; i < key.length(); i++){
            
            if(grid[0][i] != '.'){
                row1 = row1 + grid[0][i];
                        
                    }
            else if(grid[1][i] != '.'){
                row2 = row2 + grid[1][i];
    
                }
            else if(grid[2][i] != '.'){
                row3 = row3 + grid[2][i];
            }
            else{
            }
            


        }
        System.out.println(grid[0]);
        System.out.println(grid[1]);
        System.out.println(grid[2]);
        String encrypted = row1 + row2 + row3;
        System.out.println(encrypted);
        return encrypted;
    }
}

