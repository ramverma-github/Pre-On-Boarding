import React,{Component} from 'react';
import './TrackerComponent.css';
import TrackerMainForm from './TrackerMainFormComponent';

class TrackerComponent extends Component{
	constructor(props){
		super(props);
	    
		this.showUserDetailForm=this.showUserDetailForm.bind(this);		
		this.handleChange=this.handleChange.bind(this);
	    this.state={
			        showForm:false,
					email:"",
					changeState:false
				   };
		this.data=[];
	}
	
	handleChange(evt){
						this.setState({
									   email : evt.target.value
									 });
	}
	
	
	showUserDetailForm(e){
		
		e.preventDefault();
		var _this = this;
		var emailID=this.state.email;
		var reg =/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
			if(reg.test(this.state.email)===true){
		    var url="http://localhost:8005/candidateDtls/"+emailID
			fetch(url,
					  {
						  
					   method: "get",
					  
					     headers : {
									    'Content-Type':'application/json',
										'Accept': 'application/json'
									 
									 },
								
							
					   }).then(function(response){
					      response.json().then(function(jsonData){ 
						  console.log(jsonData);
						  var expectedDateOfJoining=new Date(jsonData.cndDtlsBean.expctdDateOfJoining).toLocaleDateString().split("/").reverse().join("-");
						  var offerReleaseDate = new Date(jsonData.cndDtlsBean.createdDate).toLocaleDateString().split("/").reverse().join("-");
						  _this.data={
							   requisitionID   		  : jsonData.cndDtlsBean.requisitionID,
							   candidateName   		  : jsonData.cndDtlsBean.cndName ,
							   gender          		  : jsonData.cndDtlsBean.gender,
							   contactNumber   		  : jsonData.cndDtlsBean.contactNumber,
							   candidateEmailId		  : jsonData.cndDtlsBean.emailId,
							   group           		  : jsonData.cndDtlsBean.groupId,
							   businessGroup          : jsonData.cndDtlsBean.businessGroup.businessGroup,
							   businessUnit           : jsonData.cndDtlsBean.businessUnit.businessUnit,
							   businessGroupHead      : jsonData.cndDtlsBean.businessGroup.businessGroupHead,
							   businessUnitHead       : jsonData.cndDtlsBean.businessUnit.businessUnitHead,
							   reportingTo            : jsonData.cndDtlsBean.employment[0].reportingTo,
							   skill                  : jsonData.cndDtlsBean.skillName,
							   designation            : jsonData.cndDtlsBean.designation,
							   grade                  : jsonData.cndDtlsBean.grade,
							   expectedDateOfJoining  : expectedDateOfJoining,
							   status                 : jsonData.cndDtlsBean.status,
							   reportingLocation      : jsonData.cndDtlsBean.employment[0].reportingLocation,
							   recruiter              : jsonData.cndDtlsBean.recruiter,
							   offerReleaseDate       : offerReleaseDate,
							   proposedFixedSalary    : jsonData.cndDtlsBean.salaryDetails[0].ctc,
							   proposedVariableSalary : jsonData.cndDtlsBean.salaryDetails[0].variable,
							   joiningBonus           : jsonData.cndDtlsBean.salaryDetails[0].joiningBonus,
							   source                 : jsonData.cndDtlsBean.source,
							   refreeName             : jsonData.cndDtlsBean.refreeName,
							   onboardingLeadTime     : jsonData.cndDtlsBean.onboardingLeadTime,
							   offerAcknowledgement   : jsonData.cndDtlsBean.offerAcknowledgement,
							   teamOwner       		  : jsonData.cndDtlsBean.teamOwner,
							   remarks                : jsonData.cndDtlsBean.remarksDetails[0].remarks,
							   bgId                   :jsonData.cndDtlsBean.businessGroup.bgId,
							   buId                   :jsonData.cndDtlsBean.businessUnit.buId,
							   cndId                  :jsonData.cndDtlsBean.cndId,
							   employmentId           :jsonData.cndDtlsBean.employment[0].employmentId,
							   remarkId               :jsonData.cndDtlsBean.remarksDetails[0].remarkId,
							   salaryId               :jsonData.cndDtlsBean.salaryDetails[0].salaryId
						   }
						 
						 if(_this.state.changeState===true){
							    _this.setState({
													"changeState"  : false
					                               });
						   }
						   else{
							    _this.setState({
													"changeState"  : true
					                               });
						   }
						   
						})
					   
					  })
		   
        }else{
			alert("Please enter email address");
		}
	}
	



	
  render(){
	  var _this=this;
		if(sessionStorage.getItem("Credential")!=null  ){
		  	
		  if(_this.data.length === 0)	{
			   
		 return(<div className="FormDiv">
			         <div className="FormHeader bg-primary"> 
						 <hr></hr>
						 <h3>User Details Form</h3>
				   		<hr></hr>
					 </div>
				<form>
				     <div className="EmailForm">
					   <span><label className="control-label">E-mail :</label></span>
					   <span className="EmailSpan"><input type="email" id="Email" name="Email" placeholder="Enter Email address" onChange={this.handleChange}/></span>
					   <span className="EmailSubmitButton"><button type="submit" className="btn btn-primary" onClick={this.showUserDetailForm}>Submit</button></span>
					 </div>	
				</form>	
				
					<hr></hr>			
	             
           </div>);
		 }else{
			 
			 return(<div className="FormDiv">
			         <div className="FormHeader bg-primary"> 
						 <hr></hr>
						 <h3>User Details Form</h3>
				   		<hr></hr>
					 </div>
				<form>
				     <div className="EmailForm">
					   <span><label className="control-label">E-mail :</label></span>
					   <span className="EmailSpan"><input type="email" id="Email" name="Email" placeholder="Enter Email address" onChange={this.handleChange}/></span>
					   <span className="EmailSubmitButton"><button type="submit" className="btn btn-primary" onClick={this.showUserDetailForm}>Submit</button></span>
					 </div>	
				</form>	
				
					<hr></hr>			
	            <TrackerMainForm TrackerFormData={_this.data}/>
           </div>);
		 }
	}
	else{
		window.history.pushState(null,'','/');
			return(<div></div>);
	}
		
  }
}
export default TrackerComponent;
