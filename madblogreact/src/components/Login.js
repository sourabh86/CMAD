import React from 'react';
import Navigation from './Navigation';
import Footer from './Footer';

const Login = (props)=>{
    return(
        <div>
            <Navigation loggedIn={false}/>
            <div className="container">
                <div className="row">
                    <div className="col-lg-8 col-md-8 mx-auto text-left">
                        <h1>Sign in</h1>

                    </div>
                </div>
            </div>
            <Footer />
        </div>
    );
}

export default Login;