import java.util.Date;

public class DrivingLicence {

	Name name;
	private Date dOB;
	private LicenceNumber lnum;
	private Date dOI;
	private boolean fullLicence;

	public DrivingLicence(Name name, Date dateOfBirth, Date dateOfIssue, boolean fullLicence) {
		this.name = name;
		setdOB(dateOfBirth);
		setdOI(dateOfIssue);
		lnum = LicenceNumber.getInstance(name, dateOfIssue);
		this.fullLicence = fullLicence;
	}

	// public String ToString(){
	// return ;
	// }

	public LicenceNumber getLnum() {
		return lnum;
	}

	// public void setLnum(LicenceNumber lnum) {
	// this.lnum = lnum;
	// }

	public boolean isFullLicence() {

		return fullLicence;
	}

	public void setFullLicence(boolean fullLicence) {
		this.fullLicence = fullLicence;
	}

	public Date getdOB() {
		return dOB;
	}

	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}

	public Date getdOI() {
		return dOI;
	}

	public void setdOI(Date dOI) {
		this.dOI = dOI;
	}

}
