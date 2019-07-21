import React, {Component} from 'react';
import NavBar from './NavBar';
import FooterComponent from './FooterComponent';
import './HomePage.css';

class HomePage extends Component{

  
  
  render(){
		   return(<div>   
					 <span id="span-header">
					   <img src="./Yash_Logo.jpg" alt=""/>
						 <span id="span-header1" >PreOnBoarding System</span>
					 </span>
					 <NavBar/>
					 <FooterComponent/> 
				   </div>
				  );
		  }
}
export default HomePage;
