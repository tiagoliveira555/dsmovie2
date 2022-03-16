import { ReactComponent as GithubIcon } from 'assets/img/logo.svg';
import './style.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/tiagoliveira555">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/tiagoliveira555</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;