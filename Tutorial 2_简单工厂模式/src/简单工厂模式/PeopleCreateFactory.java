package �򵥹���ģʽ;

public class PeopleCreateFactory {

	public static AbstractPeople getPeopleCreate(String type){
		
		if(type.equals("M")){
			return new ManPeople();
		}
		
		else if(type.equals("W")){
			return new WomanPeople();
		}
		
		else if (type.equals("R")){
			return new RobotPeople();
		}
		else{
			
			System.out.println("��������ȷ��ѡ��");
		}
		return null;
	}
	
}
