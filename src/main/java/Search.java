import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Даша on 11.05.14.
 */
public class Search {
    BufferedReader reader;

    private String curLine;
    private int indOfLine;

    public Search(BufferedReader reader){
        this.reader=reader;
    }

    public List<Integer> searchInText(String word){
        List<Integer> listOfPositions=new List<Integer>();

        try {
            while ((curLine=reader.readLine())!=null){
                curLine=curLine.toLowerCase();
                indOfLine++;
                InLine line=new InLine(curLine);
                if (line.searchInLine(word)) {
                    listOfPositions.add(curLine.indexOf(word));
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfPositions;
    }
}