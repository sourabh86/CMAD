import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import { Route } from 'react-router';
import { HashRouter } from 'react-router-dom';
import Post from './components/Post';
import Login from './components/Login';
import SignUp from './components/SignUp';
import NewPost from './components/NewPost';

//ReactDOM.render(<App />, document.getElementById('root'));
ReactDOM.render(
    <HashRouter baseName="/MADBlog">
        <div>
            <Route exact path="/" component={App}/>
            <Route exact path='/post/:postId' component={Post}/>
            <Route exact path='/login' component={Login}/>
            <Route exact path='/signup' component={SignUp}/>
            <Route exact path='/newpost' component={NewPost}/>
        </div>
    </HashRouter>
, document.getElementById('root'))
//registerServiceWorker();
