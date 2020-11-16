package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author mingxi
 */
public class questionList {
	//we use arraylist to hold question (object)
    private ArrayList<Question> list;
    public questionList() throws IOException {
    list = new ArrayList<Question>();
    //the buffer is used to hold the contents of all cell in a row
    String[] buffer = new String[5];
    //read the xlsx into stream
    FileInputStream fis = new FileInputStream(new File("src/Questions.xlsx"));
    //create a workbook for it
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    //create sheet form workbook
    XSSFSheet sheet = wb.getSheetAt(0);
    //iterating read the row
    java.util.Iterator<Row> itr = sheet.iterator();
    while(itr.hasNext()) {
    	Row row = itr.next();
    	java.util.Iterator<Cell> cellIterator = row.cellIterator();
    	int i = 0;
    	//iterating read all cells 
    	while(cellIterator.hasNext()) {
    	Cell cell = cellIterator.next();
    	buffer[i] = cell.getStringCellValue();
    	i++;
    	}
    	//add them in new questions into list
    	list.add(new Question(buffer[0],buffer[1],buffer[2],buffer[3],buffer[4]));
    	}
    }
    //get question content from the list
    public Question getQuestion(int id) {
    	return list.get(id);
    }
    public void removeQuestion(int id) {
    	list.remove(id);
    }
    public int getSize(){
        return list.size();
    }
}
