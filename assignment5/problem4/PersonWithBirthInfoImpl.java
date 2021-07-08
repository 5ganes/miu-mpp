package MPP.assignment5.problem4;

final public class PersonWithBirthInfoImpl implements PersonWithBirthInfo {
	
	private Person person;
	private BirthInfo birthInfo;

	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		// TODO Auto-generated method stub
		return birthInfo;
	}
	
	PersonWithBirthInfoImpl(Person person, BirthInfo birthInfo){
		this.person = person;
		this.birthInfo = birthInfo;
	}

}
