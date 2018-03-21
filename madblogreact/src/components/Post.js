import React, { Component } from 'react';
import Posts from '../posts.json';
import Navigation from './Navigation';
import Footer from './Footer';
import Search from './Search';

class Post extends Component{
    constructor(props){
        super(props);
        this.state={
            post:Posts[this.props.match.params.postId]
        }
    }
    // componentDidMount(){
    //     fetch(`/MADBlog/api/v1/posts/${this.props.match.params.postId}`).then((response)=>{
    //         return response.json();
    //     }).then((post)=>{
    //         this.setState({post})
    //     })
    // }
    render(){
        return(
            <div className="App">
                <Navigation loggedIn={true}/>
                <article>
                    <div className="container">
                        <div className="row">
                            <div className="col-lg-8 col-md-8 mx-auto text-left">
                                <div class="post-heading">
                                    <h1 id="postHeading">{this.state.post.title}</h1>
                                    <span id="postMeta" class="meta">Posted by {this.state.post.author.name}</span>
                                </div>
                                <p id="postContent">{this.state.post.content}</p>
                            </div>
                            <div className="col-lg-4 col-md-4 mx-auto">
                                <Search />
                            </div>
                        </div>
                    </div>
                </article>
                <Footer />
            </div>
        );
    }
}

export default Post;