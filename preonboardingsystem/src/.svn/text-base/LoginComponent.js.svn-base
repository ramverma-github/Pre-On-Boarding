import React,{Component} from 'react';
import './LoginComponent.css';
import HomePage from './HomePage';

class LoginComponent extends Component{
	
	constructor(props){
						super(props);
						this.sendUserCredential=this.sendUserCredential.bind(this);
						this.handleChange=this.handleChange.bind(this);
						this.state={
									username     : "",
									userPassword : "",
									flag         : false
									};
					 }
	
	handleChange(evt){
      	var state={};
		state[evt.target.name]=evt.target.value;
		this.setState(state);
	}
	
	sendUserCredential(e){
		e.preventDefault();
		if(this.state.username!=null && this.state.userPassword !=null ){
		var userCredential = {
			                   "username" : this.state.username,
							   "password" : this.state.userPassword
 							 };
		var _this=this;
	    fetch("http://localhost:8005/sendUserCredentials",{
			                                                method : "post",
															headers :{
																	  'Content-Type':'application/json',
																	  'Accept': 'application/json'
																	},
														    body : JSON.stringify(userCredential)
		                                                  }
		).then(function(response){
					    response.json().then(function(jsonData){
							 if(jsonData==="Authorized"){
								    _this.setState({
													"flag"  : true
					                               });
								sessionStorage.setItem("Credential",userCredential.username);	
                              				
							 }
							 else{
								 alert("Invalid Username or Password");
							 }
						});
					
				})			 
		}else{
			alert("Please enter Username and Password");
		}	
	}
	
render(){
	if(this.state.flag===false){
	return(<div className="Maindiv">
	         <div className="Headerdiv bg-primary">
			 <hr></hr>
                            <h3>Login</h3>
							<hr></hr>
			 </div>
	         <form>
			     <div>
				    <label  className="control-label">UserName</label>
					<input type="text" className="form-control" id="username" name="username" placeholder="Username" onChange={this.handleChange} />
				 </div>
				 <div>
				    <label  className="control-label">Password</label>
					<input type="password" className="form-control" id="userPassword" name="userPassword" placeholder="Password" onChange={this.handleChange}/>
				 </div><hr/>
				 <div className="Buttondiv form-group"> 
					<button type="submit" className="btn btn-primary" onClick={this.sendUserCredential}>Login</button>
				</div>  
			 </form>
	</div>);
	}
	else{
	return(<HomePage/>)
	}
}
	
}

export default LoginComponent;
