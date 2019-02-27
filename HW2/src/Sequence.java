import java.util.Scanner;

public class Sequence<E>{
    protected Object[] data;
    protected int size;

    public Sequence(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();}
        this.data=new Object[n];
        this.size=0;
    }

    public int size(){
        return this.size;
    }

    public void append(E element){            
        if(this.size<this.data.length){
            this.data[this.size]=element;
        }
        else{
            Object[] temp=new Object[this.size+1];
            System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data=temp;
            this.data[this.size]=element;
        }
        this.size++;    
    }

    public Object get(int k) throws IndexOutOfBoundsException{
            if(k<0 || k>=this.size){
                throw new IndexOutOfBoundsException();}
            return this.data[k];
    }

	public void print(){
		System.out.print("\nCurrent Sequence: ");
		for(int i=0;i<this.size();i++){
            System.out.print(this.get(i)+" ");
        }
		System.out.println();
	}
	
    public void insert(int index, E newElement){
        boolean insertMade=false;
                
		Object[] temp = new Object[this.data.length+1];
		for(int i=0;i<this.data.length;i++){
			if(i==index && !insertMade){
				temp[i]=newElement; 
				insertMade=true; 
				i--;
			}   //Executed during the insertion.
			else if(i>=index && insertMade){
				temp[i+1]=this.data[i];
			} //Executed after the insertion.
			else{
				temp[i]=this.data[i];
			} //Executed before the insertion.
		}
		this.data=temp;
		this.size++;
		
		this.print();
    }

	public void delete(int index){
		Object[] temp=new Object[this.data.length-1];
		for(int i=0;i<=temp.length;i++){
			if(i==index ){continue;} //Executed during the deletion.
			else if(i>=index ){
				temp[i-1]=this.data[i];
			} //Executed after the deletion.
			else{
				temp[i]=this.data[i];
			} //Executed before the deletion.
		}
		this.data=temp;
		this.size--;
		
		this.print();
	}
	
    public static void main (String[] args){
        
		Scanner in = new Scanner(System.in);
		Sequence<Integer> s = new Sequence<Integer>(5);
		s.append(1);
		s.append(2);
		s.append(3);
		s.append(4);
		s.append(5);
		s.print();
		
		int input=0;
		while(input!=3){
			System.out.println("Please enter 1 to insert, 2 to delete, or 3 to quit.");
			input=in.nextInt();
			if(input==1){
				int index,value;
				System.out.println("Please enter the value to insert.");
				value=in.nextInt();
				System.out.println("Please enter the index to insert.");
				index=in.nextInt();
				s.insert(index,value);
			}
			else if(input==2){
				int index;
				System.out.println("Please enter the index to delete.");
				index=in.nextInt();
				s.delete(index);
			}
			else if(input==3){
				System.out.println("Goodbye");
				continue;
			}
			else{
				System.out.println("Invalid choice");
			}
		}
    }   //End main
}   //End class