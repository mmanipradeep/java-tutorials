public class CustomQueue {
	
	public static void main(String args[]){
		
		MyQueue  queue = new MyQueue();
		queue.enqueue(2);
		queue.enqueue(1);
		queue.display();
		
		
	}
}
	
	class  MyQueue {
		
		int queueLength = 3;
		int [] items = new int [queueLength];
		int front  = -1 ;
		int back =-1;
		
		
		void enqueue(int itemValue){
			
			if(isFull()){
				System.out.println("Queue is full");
			}
			
			if(front == -1 && back ==-1){
				front =back =0;
				items[back] =itemValue;
			}else {
				back++;
				items[back] = itemValue;
			}
		}
			boolean isFull(){
					if(back == queueLength-1){
								return true;
						}else{
							return false;
						}
				
			}
			
			
			boolean isEmpty(){
				if(front == -1 && back == -1 ){
					
					return true;
					
			}else{
				return false;
			}
		}
		
		
				void display(){
				for (int i=front;i<=back;i++){
					System.out.print(items[i]);
				}
			}
	}

