import React from 'react';
import ReactDOM from 'react-dom';
import {BrowserRouter, Route} from 'react-router-dom';
import './index.css';
import App from './App';
import TrackerComponent from './TrackerComponent';
import LoginComponent from './LoginComponent';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(
		  <BrowserRouter>
			  <div>
				 <Route path="/" component={LoginComponent}></Route>
				 <Route path="/uploadPDF" component={App} />		
				 <Route path="/tracker" component={TrackerComponent} />	
				 <Route path="/reports" component={App} />	
			  </div>
		  </BrowserRouter>,
		 document.getElementById('root')
		);	
registerServiceWorker();
