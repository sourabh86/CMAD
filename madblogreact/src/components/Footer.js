import React from 'react';

const Footer = (props)=>{
    return(
        <footer className="page-footer navbar-fixed-bottom">
        <hr/>
        <div className="container">
        <div className="row">
          <div className="col-lg-12 col-md-12 mx-auto">
            <ul className="list-inline text-center">
              <li className="list-inline-item">
                <a href="https://github.com/sourabh86/CMAD">
                  <span className="fa-stack fa-lg">
                    <i className="far fa-circle fa-stack-2x"></i>
                    <i className="fab fa-github fa-stack-1x"></i>
                  </span>
                </a>
              </li>
            </ul>
            <p className="copyright text-muted">Copyright &copy; MADBlog 2018</p>
          </div>
        </div>
        </div>
        </footer>
    );
}

export default Footer;