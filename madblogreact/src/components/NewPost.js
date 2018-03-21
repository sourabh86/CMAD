import React, { Component } from 'react';
import Navigation from './Navigation';
import Footer from './Footer';
import { FormGroup, FormControl, ControlLabel, HelpBlock, Button } from 'react-bootstrap';

function FieldGroup({ id, label, help, ...props }) {
  return (
    <FormGroup controlId={id}>
      <ControlLabel>{label}</ControlLabel>
      <FormControl {...props} />
      {help && <HelpBlock>{help}</HelpBlock>}
    </FormGroup>
  );
}

class NewPost extends Component{
    constructor(props){
        super(props);
        this.state = {
            title:"",
            categories:"",
            content:""
        }
        this.titleChange = this.titleChange.bind(this);
        this.contentChange = this.contentChange.bind(this);
        
    }
    titleChange(e){
        this.setState({title:e.target.value})
    }
    contentChange(e){
        this.setState({content:e.target.value})
    }
    render(){
        return(
            <div>
            <Navigation loggedIn={true}/>
            <div className="container">
                <div className="row">
                    <div className="col-lg-8 col-md-8 mx-auto text-left">
                        <h1>New Post</h1><br/>
                        <form>
                            <FieldGroup id="title" type="text" label="Post Title"
                                value={this.state.title}
                                placeholder="Title"
                                onChange={this.titleChange}/>
                            <FieldGroup id="content" label="Content"
                                componentClass="textarea"
                                value={this.state.content}
                                placeholder="Post Content"
                                onChange={this.contentChange}/>
                            <Button type="submit">Submit</Button>
                            
                        </form>
                    </div>
                </div>
            </div>
            <Footer />
        </div>
        );
    }
}

export default NewPost;