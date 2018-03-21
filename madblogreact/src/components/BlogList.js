import React, { Component } from 'react';
import _ from 'lodash';
import { Link } from 'react-router-dom';

function PostPreview(props){
    return(
        <div className="post-preview text-left">
            <Link to={`/post/${props.post.id}`}>
                <h2 className="">{props.post.title}</h2>
                <h4 className="">{props.post.smallDescription}</h4>
            </Link>
            <p>Posted by {props.post.author.name}</p>
            <hr/>
        </div>
    );
}


class BlogList extends Component{
    constructor(props){
        super(props);
    }
    render(){
        const posts = _.map(this.props.posts,(post)=>{
            return <PostPreview key={post.id} post={post}/>
        });
        return(
            <div>
                {posts}
            </div>
        );
    }
}

export default BlogList;