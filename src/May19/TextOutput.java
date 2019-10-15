package May19;

public class TextOutput{
	public static void main(String[] args) {
		System.out.print(new TextOutput().hasMoreThanOneSemiColon("0xdc9d535008bd527577d2b14a3b6a2038f38a761309c7ebad4302f6704df98773;0x63cba06b1a75e74848d1303004d05d300802f6f21671090941c2af29d0104efe;IS00XS00NACHN01"));
	}
	public boolean hasMoreThanOneSemiColon(String myStr){
		return myStr.indexOf(";")!=myStr.lastIndexOf(";");
	}
}