import React, { useState } from 'react';
import {Link} from 'react-router-dom'
import './header.css';
import logo from './logo.png';
import Biglogo from "./Biglogo";


const Header = () => {
  const [isNavBarActive, setIsNavBarActive] = useState(false);

  const handleHamburgerClick = () => {
    setIsNavBarActive(prevState => !prevState);
  };

  return (
    <div>
      <header>
        <div className="header-logo">
          <a target="_parent" to="#">
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
            <li><a target="_parent" to="#"><strong>Soy protectora</strong></a></li>
            <li><a target="_parent" to="#"><strong>Quiero adoptar</strong></a></li>
            <li><a target="_parent" to="#">Nosotros</a></li>
            <li><a target="_parent" to="#">Contacto</a></li>
          </ul>
        </nav>
      </header>
      <Biglogo />
    </div>
  );
};

export default Header;
