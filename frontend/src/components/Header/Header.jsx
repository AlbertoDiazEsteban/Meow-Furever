import React, { useState } from 'react';
import './header.css';
import logo from './logo.png';

const Header = () => {
  const [isNavBarActive, setIsNavBarActive] = useState(false);

  const handleHamburgerClick = () => {
    setIsNavBarActive(prevState => !prevState);
  };

  return (
    <div>
      <header>
        <div className="header-logo">
          <a target="_parent" href="#">
            <img src={logo} alt="logo" />
          </a>
        </div>
        <div className={`header-hamburger ${isNavBarActive ? 'active' : ''}`} onClick={handleHamburgerClick}>
          <span id="line1" className="line" style={{ transform: isNavBarActive ? 'rotate(45deg)' : 'none' }}></span>
          <span id="line2" className="line" style={{ transform: isNavBarActive ? 'scale(0)' : 'none' }}></span>
          <span id="line3" className="line" style={{ transform: isNavBarActive ? 'rotate(-45deg)' : 'none' }}></span>
        </div>
        <nav className={`header-nav-bar ${isNavBarActive ? 'active' : ''}`}>
          <ul>
            <li><a target="_parent" href="#"><strong>Soy protectora</strong></a></li>
            <li><a target="_parent" href="#"><strong>Quiero adoptar</strong></a></li>
            <li><a target="_parent" href="#">Nosotros</a></li>
            <li><a target="_parent" href="#">Contacto</a></li>
          </ul>
        </nav>
      </header>
    </div>
  );
};

export default Header;
