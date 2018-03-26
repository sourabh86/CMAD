import React from 'react';
import Navigation from './Navigation';
import Footer from './Footer';
import { Link } from 'react-router-dom';
import { Form, Col, Checkbox, FormGroup, FormControl, ControlLabel, HelpBlock, Button } from 'react-bootstrap';

class SignUp extends React.Component{
    constructor(props){
        super(props);
        this.state={
            "email":"",
            "password":"",
            "confirmPassword":""
        }
    }

    render(){
        return(
            <div>
                <Navigation loggedIn={false}/>
                <div className="container">
                    <div className="row">
                        <div className="col-lg-8 col-md-8 mx-auto text-left">
                        <h1>Sign Up</h1><br/>
                        <Form horizontal>
                            <FormGroup controlId="formHorizontalEmail">
                                <Col componentClass={ControlLabel} sm={2}>
                                Email
                                </Col>
                                <Col sm={10}>
                                <FormControl type="email" placeholder="Email" />
                                </Col>
                            </FormGroup>

                            <FormGroup controlId="formHorizontalPassword">
                                <Col componentClass={ControlLabel} sm={2}>
                                Password
                                </Col>
                                <Col sm={10}>
                                <FormControl type="password" placeholder="Password" />
                                </Col>
                            </FormGroup>

                            <FormGroup controlId="formHorizontalPassword">
                                <Col componentClass={ControlLabel} sm={2}>
                                Confirm Password
                                </Col>
                                <Col sm={10}>
                                <FormControl type="password" placeholder="Confirm Password" />
                                </Col>
                            </FormGroup>

                            <FormGroup>
                                <Col smOffset={2} sm={10}>
                                <Button type="submit">Sign Up</Button>
                                </Col>
                            </FormGroup>

                            <FormGroup>
                                <Col smOffset={2} sm={10}>
                                Already a member? <Link to="/login">Sign In </Link>
                                </Col>
                            </FormGroup>

                            </Form>
                        </div>
                    </div>
                </div>
                <Footer />
            </div>
        );
    }
}

export default SignUp;