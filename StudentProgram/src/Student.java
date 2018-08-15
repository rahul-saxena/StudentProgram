public class Student {
	int studentId;
	String name;
	float qualifyingExamMarks;
	String residentialStatus;
	int yearOfEngg;
	
    	public int getStudentId() {
    		
    		return studentId;
    	}
	
    	public void setStudentId(int studentId) {
    		this.studentId=studentId;
    		
    	}
    	
    	public String getName() {
    		
    		return name;
    	}
    	
    	public void setName(String name) {
    		this.name=name;
    	}
    	
    	public float getQualilfyingExamMarks() {
    		return qualifyingExamMarks;
    	}
    	
    	public void setQualilfyingExamMarks(float qualifyingExamMarks) {
    		this.qualifyingExamMarks=qualifyingExamMarks;
    	}
    	
    	public String getResidentialStatus() {
    		return residentialStatus;
    	}
    	
    	public void setResidentialStatus(String residentialStatus) {
    		if ( residentialStatus.equals("Hosteller")) {
    			this.residentialStatus="H";
    		}
    		else {
    			this.residentialStatus="D";
    		}
    		
    	}
    	
    	public int getYearOfEngg() {
    		return yearOfEngg;
    	}
    	
    	public void setYearOfEngg(int yearOfEngg) {
    		this.yearOfEngg=yearOfEngg;
    	}

}