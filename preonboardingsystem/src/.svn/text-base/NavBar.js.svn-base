import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import './NavBar.css';
class NavBar extends Component{

render(){
  return(
         <nav className="navbar navbar-dark bg-primary" >
            <div className="container-fluid">
               <ul className="nav navbar-nav" id="test">
					<li className="dropdown" >
						<a className="dropdown-toggle" id="Navbartext" data-toggle="dropdown" >Onboard
						<span className="caret"></span></a>
 					    <ul className="dropdown-menu" >
						  <li><Link to="/uploadPDF">Upload PDF</Link></li>
						  <li><Link to="/tracker">Tracker</Link></li>
					    </ul>
 				    </li>
				    <li ><Link to="/reports" id="Navbartext">Reports</Link></li>
				</ul>
            </div>
         </nav>);
        }

}
export default NavBar;
