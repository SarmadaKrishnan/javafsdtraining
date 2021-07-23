import React from 'react';
import ReactDOM from 'react-dom';
import logo from './logo.svg';
import './App.css';
import './index.css';
import App from './App';
//import * as serviceWorker from './serviceWorker';

var element = React.createElement('h1', { className: 'greeting' }, 'Hello, world!');
ReactDOM.render(element, document.getElementById('root'));
//serviceWorker.unregister();
export default example5;