
public class Test {

	
		public static void main(String[] args) {

			try {

				// הוראה לג'אווה להכיר את הדרייבר של דרבי
				// דרייבר הוא מנגנון ההתחברות למסד הנתונים
				Class.forName("org.apache.derby.jdbc.ClientDriver");

				DB.buildDB();

				DB.insert("Pen", 2.5);
				DB.insert("Pencil", 1.2);
				DB.insert("Notebook", 3);

				DB.update(1, "Green Pen", 2.7);

				DB.delete(5);
				DB.delete(700);

				DB.readAll();
			} catch (Exception ex) {
				System.out.println("Error: " + ex.getMessage());
			}

		}

	

	}


