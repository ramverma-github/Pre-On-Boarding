import React, { Component } from 'react';
import './App.css';

class App extends Component {
	
	constructor(props){
		super(props);
		this.state={file : null }
		this.handleChange=this.handleChange.bind(this);
        this.uploadPDF=this.uploadPDF.bind(this);		
		
	}
	
	
	handleChange(evt){
		console.log(evt.target.value);
         this.setState({
            file : evt.target.files[0]
        });
	
	}
	
	uploadPDF(){
		var formData=new FormData();
		formData.append("userFile", this.state.file);
		
		fetch("http://localhost:8005/PDF",
					  {
						  
					   method: "POST",
					  
					     headers : {
									    'enctype' : 'multipart/form-data',
		    	                        'Accept': 'application/json'
									 
									 },
									
					   body: formData,
					   
					   }).then(function(response){
					   console.log(response);
					   
					  })	
					  
		
	}
	
               
	
  render() {
	  
	  if(sessionStorage.getItem("Credential")!=null){
	
			return (   <div className="Maindiv ">
							<div className="Headerdiv bg-primary"> 
							<hr></hr>
								<h3>Upload PDF</h3>
								<hr></hr>
							</div>
							<div className="Inputdiv form-group">
							   <input type="file" className="form-control" id="pdf" name="file" onChange ={this.handleChange}/>
							   <hr></hr>
							</div>
							
							<div className="Buttondiv form-group">
								<button className="uploadbutton btn btn-primary" onClick={this.uploadPDF}>Upload</button>
							</div>
						</div>    
					 );
	  }else{
	        window.history.pushState(null,'','/');
			return(<div></div>);
           }	  
  }
}

export default App;
