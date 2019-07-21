import React, {Component} from 'react';
import './TrackerComponent.css';

class TrackerMainForm extends Component{
	
	constructor(props){
		super(props);
		this.handleChange=this.handleChange.bind(this);
		this.sendTrackerFormData=this.sendTrackerFormData.bind(this);
	    this.state= {
			         RRFID                  : "",
					 candidateName          : "",
					 gender                 : "",
					 contactNumber          : "",
					 emailId                : "",
					 group                  : "",
					 businessGroup          : "",
					 businessUnit           : "",
					 BGH                    : "",
					 BUH                    : "",
					 reportingTo            : "",
					 guestHouse             : "",
					 natureOfHiring         : "",
					 client                 : "",
					 offerYear              : "",
					 talentAdvisor          : "",
					 PHVInitiated           : "",
					 skill                  : "",
					 designation            : "",
					 grade                  : "",
					 EDOJ                   : "",
					 status                 : "",
					 primaryBaseLocation    : "",
					 reportingLocation      : "",
					 presentFixedCTC        : "",
					 presentVariableCTC     : "",
					 proposedFixedSalary    : "",
					 proposedVariableSalary : "",
					 hikePercent            : "",
					 recruiter              : "",
					 offerReleaseDate       : "",
					 joiningBonus           : "",
					 currentEmployer        : "",
					 source                 : "",
					 currentLocation        : "",
					 refreeName             : "",
					 onboardingLeadtime     : "",
					 offerAcknowledgement   : "",
					 separationEmail        : "",
					 teamOwner              : "",
					 remarks                : "",
					 bgId                   : "",
					 buId                   : "",
					 cndId                  : "",
					 employmentId           : "",
					 remarkId               : "",
					 salaryId               : ""
					 };
			}
	
	componentDidMount(props){
							this.setState({
											RRFID                    : this.props.TrackerFormData.requisitionID,
											candidateName            : this.props.TrackerFormData.candidateName,
											gender                   : this.props.TrackerFormData.gender,
											contactNumber            : this.props.TrackerFormData.contactNumber,
											emailId                  : this.props.TrackerFormData.candidateEmailId,
											group                    : this.props.TrackerFormData.group,
											businessGroup            : this.props.TrackerFormData.businessGroup,
											businessUnit             : this.props.TrackerFormData.businessUnit,
											BGH                      : this.props.TrackerFormData.businessGroupHead,
											BUH                      : this.props.TrackerFormData.businessUnitHead,
											expectedDateOfJoining	 : this.props.TrackerFormData.expectedDateOfJoining,
											status               	 : this.props.TrackerFormData.status,
											recruiter            	 : this.props.TrackerFormData.recruiter,
											offerReleaseDate     	 : this.props.TrackerFormData.offerReleaseDate,
											proposedFixedSalary   	 : this.props.TrackerFormData.proposedFixedSalary,
											proposedVariableSalary   : this.props.TrackerFormData.proposedVariableSalary,
											joiningBonus         	 : this.props.TrackerFormData.joiningBonus,
											source               	 : this.props.TrackerFormData.source,
											refreeName           	 : this.props.TrackerFormData.refreeName,
											onboardingLeadtime   	 : this.props.TrackerFormData.onboardingLeadTime,
											offerAcknowledgement 	 : this.props.TrackerFormData.offerAcknowledgement,
											teamOwner            	 : this.props.TrackerFormData.teamOwner,
											remarks              	 : this.props.TrackerFormData.remarks,
											reportingTo          	 : this.props.TrackerFormData.reportingTo,
											skill                	 : this.props.TrackerFormData.skill,
											designation          	 : this.props.TrackerFormData.designation,
											grade                	 : this.props.TrackerFormData.grade,
											reportingLocation    	 : this.props.TrackerFormData.reportingLocation,
											bgId    				 : this.props.TrackerFormData.bgId,
											buId    	             : this.props.TrackerFormData.buId,
											cndId    	             : this.props.TrackerFormData.cndId,
											employmentId         	 : this.props.TrackerFormData.employmentId,
											remarkId    	         : this.props.TrackerFormData.remarkId,
											salaryId    	         : this.props.TrackerFormData.salaryId
								         });
	                        }
	
	sendTrackerFormData(e){
							e.preventDefault();
							var candidateFormBean = {
													"requisitionId"          : this.state.RRFID,
													"candidateName"        	 : this.state.candidateName,
													"gender"                 : this.state.gender,
													"contactNumber"          : this.state.contactNumber,
													"emailId"                : this.state.emailId,
													"group"                  : this.state.group,
													"businessGroup"          : this.state.businessGroup,
													"businessUnit"           : this.state.businessUnit,
													"businessGroupHead"      : this.state.BGH,
													"businessUnitHead"       : this.state.BUH,
													"reportingTo"            : this.state.reportingTo,
													"guestHouse"             : this.state.guestHouse,
													"natureOfHiring"         : this.state.natureOfHiring,
													"client"                 : this.state.client,
													"offerYear"              : this.state.offerYear,
													"talentAdvisor"          : this.state.talentAdvisor,
													"phvInitiated"           : this.state.PHVInitiated,
													"skill"                  : this.state.skill,
													"designation"            : this.state.designation,
													"grade"                  : this.state.grade,
													"expectedDateOfJoining"  : this.state.EDOJ,
													"status"                 : this.state.status,
													"primaryBaseLocation"    : this.state.primaryBaseLocation,
													"reportingLocation"      : this.state.reportingLocation,
													"presentFixedCTC"        : this.state.presentFixedCTC,
													"presentVariableCTC"     : this.state.presentVariableCTC,
													"proposedFixedSalary"    : this.state.proposedFixedSalary,
													"proposedVariableSalary" : this.state.proposedVariableSalary,
													"hikePercent"            : this.state.hikePercent,
													"recruiter"              : this.state.recruiter,
													"offerReleaseDate"       : this.state.offerReleaseDate,
													"joiningBonus"           : this.state.joiningBonus,
													"currentEmployer"        : this.state.currentEmployer,
													"source"                 : this.state.source,
													"currentLocation"        : this.state.currentLocation,
													"refreeName"             : this.state.refreeName,
													"onboardingLeadtime"     : this.state.onboardingLeadtime,
													"offerAcknowledgement"   : this.state.offerAcknowledgement,
													"separationEmail"        : this.state.separationEmail,
													"teamOwner"              : this.state.teamOwner,
													"remarks"                : this.state.remarks,
													"bgId"                   : this.state.bgId,
													"buId"                   : this.state.buId,
													"cndId"                  : this.state.cndId,
													"employmentId"           : this.state.employmentId,
													"remarkId"               : this.state.remarkId,
													"salaryId"               : this.state.salaryId
												  };
											 
							fetch("http://localhost:8005/updateCndDtls",{
																		 method : "post",
																		 headers : {
																					  'Content-Type':'application/json',
																					  'Accept': 'application/json'
																				   },
																		 body : JSON.stringify(candidateFormBean)
																	    }
								 ) 
	  }
	
	handleChange(evt){
						 var state={};
						 state[evt.target.name]=evt.target.value;
						 this.setState(state);
	                 }
	
render(){
			return(<div className="scrollproperty">
                   <form  id="UserDetailFormId" >
				       <div className="ComponentsDiv"> 
					       <span className="ComponentSpan">
								<label  className="control-label">RRFID</label>
								<input type="text" id="RRFID" name="RRFID" placeholder="RRFID" defaultValue={this.props.TrackerFormData.requisitionID} onChange={this.handleChange}/>
							  </span>
						</div>
							
							<div className="ComponentsDiv" > 
		                        <div className="ComponentDiv">
							       <span>
								     <label className="control-label">Candidate Name</label>
								     <input type="text" id="Candidate_Name" name="candidateName" placeholder="Full Name" defaultValue={this.props.TrackerFormData.candidateName} onChange={this.handleChange}/>
								   </span>
								</div>
								<div >
									<span>	
										<label  className="control-label">Gender</label>
										<select id="Gender" name="gender" defaultValue={this.props.TrackerFormData.gender} onChange={this.handleChange}>
											<option value="Male">Male</option>
											<option value="Female">Female</option>
										</select>	
									</span>
								</div>
							</div>	

	                      <div className="ComponentsDiv"> 
								<div className="ComponentDiv">
										<span>
											<label className="control-label">Contact No</label>
											<input type="text" id="Contact_No" name="contactNumber" placeholder="Number" defaultValue={this.props.TrackerFormData.contactNumber} onChange={this.handleChange} />
											</span>
								</div>
								<div>							
									<span>
										<label className="control-label">Email ID</label>
										<input type="email" id="Email_ID" name="emailId" placeholder="email id" defaultValue={this.props.TrackerFormData.candidateEmailId} onChange={this.handleChange}/>
										</span>
								 </div>	
							</div>								
													
							<div className="ComponentsDiv">
								   <div className="ComponentDiv">							
										  <span>
											<label  className="control-label">Group</label>
										    <input type="text" id="Group" name="group" defaultValue={this.props.TrackerFormData.group} onChange={this.handleChange}/>	
										  </span>	
									</div>
									<div className="ThreeComponentDiv">
										  <span className="SecondSpan">
											<label  className="control-label">BG</label>
										    <input type="text" id="BusinessGroup" name="businessGroup" defaultValue={this.props.TrackerFormData.businessGroup} onChange={this.handleChange}/>	
										 </span>
									</div>	
									<div >		
										 <span>
											<label  className="control-label">BU</label>
											 <input type="text" id="BusinessUnit" name="businessUnit" onChange={this.handleChange} defaultValue={this.props.TrackerFormData.businessUnit} />	
											</span>
									</div>		
							 </div>
													
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv"> 
								 <span>
									<label  className="control-label">BGH</label>
                                     <input type="text" id="BGH" name="BGH" placeholder="Business Group Head" defaultValue={this.props.TrackerFormData.businessGroupHead} onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div >
							 <span>
							    <label  className="control-label">BUH</label>
								<input type="text" id="BUH" name="BUH" placeholder="BusinessUnit Head" defaultValue={this.props.TrackerFormData.businessUnitHead} onChange={this.handleChange}/>
							 </span>
							 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
							 <span>
								<label  className="control-label">Reporting To</label>
								<input type="text" id="Reporting_to" name="reportingTo" placeholder="Reporting to" defaultValue={this.props.TrackerFormData.reportingTo} onChange={this.handleChange}/>
							 </span>
							 </div>
							 <div>
								 <span>
									<label  className="control-label">GH Availment</label>
									<select id="GH" name="guestHouse" onChange={this.handleChange}>
										<option value="No">No</option>
										<option value="Yes">Yes</option>
									</select>	
								 </span>
							 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
							 <span>
								<label  className="control-label">Nature Of Hiring</label>
							     <select id="Nature_Of_Hiring" name="natureOfHiring" onChange={this.handleChange} >
							     <option>Contract</option>
								 <option>Lateral</option>
								 <option>Trainee</option>
							   </select>
							 </span>
							 </div>
							 <div >
							 <span>
							    <label  className="control-label">Client(Hiring For)</label>
								<input type="text" id="Client" name="client" placeholder="Hiring for" onChange={this.handleChange}/>
							 </span>
							 </div>
							</div>	
							
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
							 <span>
								<label  className="control-label">Offer Year</label>
								<input type="text" id="Offer_Year" name="offerYear" placeholder="Offer Year" onChange={this.handleChange}/>
							 </span>
							 </div>
							 <div >
							<span>
							    <label  className="control-label">Talent Advisor</label>
								<input type="text" id="Talent_Advisor" name="talentAdvisor" placeholder="Talent Advisor" onChange={this.handleChange}/>
							 </span>
							 </div>
							
							</div>	
							
							<div className="ComponentsDiv"> 
								 <div className="ComponentDiv">
									 <span>
										<label  className="control-label">PHV Initiated</label>
										<select id="PHV_Initiated" name="PHVInitiated" onChange={this.handleChange}>
										   <option value="Yes">Yes</option>
											<option value="No">No</option>
											<option value="Hold">Hold</option>
										</select>	
									 </span>
								 </div>
								<div>
									<span>
										<label  className="control-label">Skills</label>
										<input type="text" id="Skills" name="skills" placeholder="Skill" defaultValue={this.props.TrackerFormData.skill} onChange={this.handleChange}/>
								 </span>
								</div>
							</div>	
							
						<div className="ComponentsDiv"> 
						   
							 <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Designation</label>
									<input type="text" id="Designation" name="designation" placeholder="Designation" defaultValue={this.props.TrackerFormData.designation} onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div>
								 <span>
									<label  className="control-label">Grade</label>
									<input type="text" id="Grade" name="grade" placeholder="Grade" defaultValue={this.props.TrackerFormData.grade} onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
						<div className="ComponentsDiv"> 
						   <div className="ComponentDiv">
							 <span>
								<label  className="control-label">Expected Date Of Joining</label>
								<input type="date" id="EDOJ" name="EDOJ" placeholder="EDOJ" defaultValue= {this.props.TrackerFormData.expectedDateOfJoining} onChange={this.handleChange}/>
							 </span>
							 </div>
							 <div>
								<span>
									<label  className="control-label">Status</label>
									<select id="Status" name="status" defaultValue={this.props.TrackerFormData.status}  onChange={this.handleChange}>
									   <option value="Yet to Join">To Be Join</option>
									    <option value="Back Off">Back Off</option>
										 <option value="Dropped">Dropped</option>
										  <option value="Joined">Joined</option>
										   <option value="Probable back off">Probable back off</option>
									</select>	
								 </span>
							  </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							  <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Primary Base Location</label>
									<input type="text" id="Primary_Base_Location" name="primaryBaseLocation" placeholder="Primary Base Location" onChange={this.handleChange}/>
								 </span>
							  </div>
							  <div>
								 <span>
									<label  className="control-label">Reporting Location</label>
									<input type="text" id="Reporting_Location" name="reportingLocation" placeholder="Reporting Location" defaultValue={this.props.TrackerFormData.reportingLocation} onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							  <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Present Fixed CTC</label>
									<input type="text" id="Present_Fixed_CTC" name="presentFixedCTC" placeholder="Present Fixed CTC" onChange={this.handleChange}/>
								 </span>
							  </div>
							  <div >
								 <span>
									<label  className="control-label">Present Variable CTC</label>
									<input type="text" id="Present_Variable_CTC" name="presentVariableCTC" placeholder="Present Variable CTC" onChange={this.handleChange}/>
								 </span>					
 							 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Proposed Fixed Salary</label>
									<input type="text" id="Proposed_Fixed_Salary" name="proposedFixedSalary" placeholder="Proposed_Fixed_Salary" defaultValue={this.props.TrackerFormData.proposedFixedSalary} onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div >
								 <span>
									<label  className="control-label">Proposed Variable Salary</label>
									<input type="text" id="Proposed_Variable_Salary" name="proposedVariableSalary" placeholder="Proposed Variable Salary" defaultValue={this.props.TrackerFormData.proposedVariableSalary} onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
														
							<div className="ComponentsDiv"> 
							  <div className="ComponentDiv">
								 <span>
									<label  className="control-label">% of Hike</label>
									<input type="text" id="Hike_Percent" name="hikePercent" placeholder="Without %" onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div>
								 <span>
									<label  className="control-label">Recruiter</label>
									<input type="text" id="Recruiter" name="recruiter" placeholder="Recruiter" defaultValue={this.props.TrackerFormData.recruiter} onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Offer Release Date</label>
									<input type="Date" id="Offer_Release_Date" name="offerReleaseDate" placeholder="Offer_Release_Date" defaultValue={this.props.TrackerFormData.offerReleaseDate} onChange={this.handleChange}/>
								 </span>
							 </div>
							<div>
								  <span>
									<label  className="control-label">Joining Bonus</label>
<input type="text" id="Joining_Bonus" name="joiningBonus" placeholder="Joining Bonus"  defaultValue={this.props.TrackerFormData.joiningBonus} onChange={this.handleChange}/>
								  </span>
								 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Current Employer</label>
									<input type="text" id="Current_Employer" name="currentEmployer" placeholder="Current Employer" onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div>
								 <span>
									<label  className="control-label">Source</label>
<input type="text" id="Source" name="source" placeholder="Source" defaultValue={this.props.TrackerFormData.source} onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Current Location</label>
									<input type="text" id="Current Location" name="currentLocation" placeholder="Current Location" onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div >
								 <span>
									<label  className="control-label">Refree Name/Vendor Name</label>
									<input type="text" id="Refree_Name" name="refreeName" defaultValue={this.props.TrackerFormData.refreeName} placeholder="Refree Name" onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
							
							
							<div className="ComponentsDiv"> 
							 <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Onboarding Lead time</label>
									<input type="text" id="Onboarding_Lead_time" name="onboardingLeadtime" defaultValue={this.props.TrackerFormData.onboardingLeadTime} placeholder="Onboarding Lead time" onChange={this.handleChange}/>
								 </span>
							 </div>
							 <div>
								 <span>
									<label  className="control-label">Offer acknowledgement</label>
								    <input type="text" id="Offer_acknowledgement" name="offerAcknowledgement"  defaultValue={this.props.TrackerFormData.offerAcknowledgement} onChange={this.handleChange}/>
								 </span>
							 </div>
							</div>	
							
							<div className="ComponentsDiv"> 
							  <div className="ComponentDiv">
								 <span>
									<label  className="control-label">Separation Email</label>
									<select id="Separation_Email" name="separationEmail" onChange={this.handleChange}>
									   <option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>	
								 </span>
							 </div>
							 <div>
								  <span>
									<label  className="control-label">Team Owner</label>
									<input type="text" id="Team_Owner" name="teamOwner" placeholder="Team_Owner" defaultValue={this.props.TrackerFormData.teamOwner} onChange={this.handleChange}/>
								  </span>
							  </div>
							</div>	
							
							
							<div className="ComponentsDiv"> 
							    <span>
							     <label  className="control-label">Remarks/Comments</label>
								 
								 <input type="text" id="Remarks" name="remarks" placeholder="Remarks/Comments" defaultValue={this.props.TrackerFormData.remarks} onChange={this.handleChange}/>
							    </span>
							</div>	
							
							<div className="ComponentsDiv"> 
								<button  type="submit" className="btn btn-primary" onClick={this.sendTrackerFormData}>Update</button>
							</div>
					   
				    </form> </div>);
}

}

export default TrackerMainForm;
