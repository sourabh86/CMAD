import React , { Component } from 'react';
import { Navbar, NavItem, NavDropdown, Nav, MenuItem } from 'react-bootstrap';
import { Link } from 'react-router-dom';

function RightMenu(props){
    return props.loggedIn
                ?
                <NavDropdown eventKey={1} title="User" id="basic-nav-dropdown">
                    <MenuItem eventKey={1.1}>My Posts</MenuItem>
                    <MenuItem eventKey={1.2}>New Post</MenuItem>
                    <MenuItem divider />
                    <MenuItem eventKey={1.3}>Settings</MenuItem>
                    <MenuItem divider />
                    <MenuItem eventKey={1.4}>Sign Out</MenuItem>
                </NavDropdown>
                :
                <NavItem eventKey={2} href="#Login">
                    Sign in
                </NavItem>
                ;
}

export default class Navigation extends Component{
    render(){
        return(
            <div>
                <Navbar inverse collapseOnSelect>
                <Navbar.Header>
                    <Navbar.Brand>
                    <a href="/">MADBlog</a>
                    </Navbar.Brand>
                    <Navbar.Toggle />
                </Navbar.Header>
                <Navbar.Collapse>
                    <Nav pullRight>
                        <RightMenu loggedIn={this.props.loggedIn} />
                    </Nav>
                </Navbar.Collapse>
                </Navbar>
            </div>
        )
    }
}