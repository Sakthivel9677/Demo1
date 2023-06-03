package FunctionRevision;

public class Example {
	public String check(String name) {
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
				return name+"contain vowels";
	}
else {
	return name+"does not contain vowel";
	}

	}
	public int d() {
		String name="HelloWorld";
		int count=0;
		for(int i=0;i<name.length();i++) {
		
			if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
		count++;
		
	}}
		return count;
	
		}
	public int x(int a) {
		String b="HelloWorld";
		
		int count=0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') {
				count++;
			}
			
		}
		return count;
	}
	
public String y() {
	String a="abcDEF123@gmail.com";
	int c=0;
	int b=0;
	int d=0;
	int q=0;
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {
			c++;
		}
		else if(a.charAt(i)=='a'&&a.charAt(i)=='z'){
				b++;
	}
		else if( a.charAt(i)>='0'&&a.charAt(i)<='9') {
			q++;
		}
		else {
			d++;
		}
	
	}
	return (c+" "+b+" "+q+" "+d);
}
String name;
int id;
int mark;

}
The file has been edite twice for git demo



