package string;

public class CountVovel {

	public static void main(String[] args) {
		String str = "Hello I Am pooja surwase"; 
        String st = " ";  
        int count = 0;  
        for (int i = 0; i < str.length(); i++) {  
            char c = str.charAt(i); 
            st = st + c;  
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { 
            }
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') { 
                count++;  
            }
        }
        System.out.println(count); 
    }

		

	}

