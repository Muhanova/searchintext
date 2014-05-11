/**
 * Created by Даша on 11.05.14.
 */
public class InLine {
    private String line;

    public InLine(String line){
        this.line=line;
    }

    public boolean searchInLine(String word){
        char[] charsW=word.toCharArray();
        char[] charsL=line.toCharArray();

        boolean b=true;

        for(int i=0; i<charsL.length; i++){
            if(charsL[i]==charsW[0]){
                for (int j=0; j<charsW.length && b;j++){
                    if (charsL[i+1] == charsW[j+1]) {
                    return true;
                } else {
                    b=false;
                    }
                }
            }
        }
        return false;
    }
}
