package entity;
// Generated 2016-11-11 9:13:29 by Hibernate Tools 5.1.0.Beta1

/**
 * Agent generated by hbm2java
 */
public class Agent implements java.io.Serializable {

	private String agentId;
	private String agentName;
	private String agentConnectperson;
	private String agentConnectpname;
	private String agentCpphone;
	private String agentCpemail;
	private Boolean isregister;

	public Agent() {
	}

	public Agent(String agentId) {
		this.agentId = agentId;
	}

	public Agent(String agentId, String agentName, String agentConnectperson, String agentConnectpname,
			String agentCpphone, String agentCpemail, Boolean isregister) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentConnectperson = agentConnectperson;
		this.agentConnectpname = agentConnectpname;
		this.agentCpphone = agentCpphone;
		this.agentCpemail = agentCpemail;
		this.isregister = isregister;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentConnectperson() {
		return this.agentConnectperson;
	}

	public void setAgentConnectperson(String agentConnectperson) {
		this.agentConnectperson = agentConnectperson;
	}

	public String getAgentConnectpname() {
		return this.agentConnectpname;
	}

	public void setAgentConnectpname(String agentConnectpname) {
		this.agentConnectpname = agentConnectpname;
	}

	public String getAgentCpphone() {
		return this.agentCpphone;
	}

	public void setAgentCpphone(String agentCpphone) {
		this.agentCpphone = agentCpphone;
	}

	public String getAgentCpemail() {
		return this.agentCpemail;
	}

	public void setAgentCpemail(String agentCpemail) {
		this.agentCpemail = agentCpemail;
	}

	public Boolean getIsregister() {
		return this.isregister;
	}

	public void setIsregister(Boolean isregister) {
		this.isregister = isregister;
	}

}
