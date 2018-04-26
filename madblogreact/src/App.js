import React, { Component } from 'react';
import Navigation from './components/Navigation';
import Footer from './components/Footer';
import BlogList from './components/BlogList';
import Posts from './posts.json';
import Search from './components/Search';
import './App.css';

class App extends Component {
  constructor(props){
    super(props);
    this.state = {
      posts:Posts
    }
  }

  componentDidMount(){
    //fetch("http://54.218.245.216:8080/MADBlog/api/v1/posts/",{
    const options = {headers: new Headers({'Access-Control-Allow-Origin':'*'})};
    fetch("http://52.38.61.62:8080/MADBlog/api/v1/posts/").then((response)=>{
      return response.json();
    }).then((posts)=>{
      this.setState({posts})
    })
  }
  
  render() {
    return (
      <div className="App">
        <Navigation loggedIn={true}/>
        
        <div className="container">
            <div className="row">
                <div className="col-lg-8 col-md-8 mx-auto">
                    <BlogList posts={this.state.posts}/>
                </div>
                <div className="col-lg-4 col-md-4 mx-auto">
                    <Search />
                </div>
              </div>
          </div>
        <Footer />
      </div>
    );
  }
}

export default App;
