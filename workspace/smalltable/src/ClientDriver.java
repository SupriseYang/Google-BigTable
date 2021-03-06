import java.io.IOException;


public class ClientDriver {

	public static void main(String args[]) throws IOException {
		SmallTable.HOST = "localhost";
		SmallTable.PORT = 6605;
		
		SmallTable table = new SmallTable("simpletable");
		table.addColumnFamily("family1");
		table.addColumnFamily("family2");
//		 send request to master to create table
		table.create();
//		 
//		SmallTable table1 = new SmallTable("simpletable");
//		if(!table1.open()) {
//			System.out.println("Failed to open table");
//		}
//		System.out.println("Opened table > \nFamilies > \n" + table1.columnFamilies);
//		System.out.println("Map > \n" + table1.tabletMap);
//		table1.delete();
		//SmallTable table2 = new SmallTable("simpletable");
		//table.delete();
		
		//SmallTable table3 = new SmallTable("simpletable");
		//table.addColumnFamily("family2");
		// update schema
		//table.update();
		// send request to tablet server
		//SmallRow row = table.getRow("com.cnn.www");
		// send 
		//row.setColumn("familyname:foo", "hello", 5);
		// previous timestamp + 1
		//row.setColumn("familyname:foo", "hello");
		
		//row.deleteColumn("familyname:foo");
		// get most recent value
		//row.getColumn("familyname:foo");
		
		//row.getColumn("familyname:foo", 5);
		
		//table.setRow(row);
		//row.getColumnFamily("familyname");
		
		//table.FetchColumnFamily("anchor");
		
		//table.getAllRow();
		SmallRow newrow = new SmallRow();
		newrow.setColumn("family1:_start", "yo");
		newrow.setColumn("family1:koo", "yo");
		newrow.setColumn("family1:~end", "zoo");
		newrow.setColumn("family2:foo", "yo");
		newrow.setColumn("family2:foo", "zoo");
		newrow.setColumn("family2:foo", "yo");

		//System.out.println(newrow);
		table.addRow("com.google.www", newrow);
		//SmallTable table = new SmallTable("simpletable");
		//table.open();
		SmallRow anotherRow = table.getRow("com.google.www");

		System.out.println("Reading row" + anotherRow);
		//table.addRow(newrow);
		
		//table.getRow("com.google.www");
		


	}
}
