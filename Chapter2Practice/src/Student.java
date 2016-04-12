
		//Number 12
		public class Student{
			private String name;
			private int id;
			
			public Student(){
				
			}
			
			public Student(String name, int id){
				this.name = name;
				this.id = id;
			}
			
			public void setName(String newName){
				this.name = newName;
			}
			
			public String getName(){
				return this.name;
			}
			
			public int getId(){
				return this.id;
			}
			
			public String toString(){
				return getName()+" is a student object with an id of: "+ getId();
			}
		}
