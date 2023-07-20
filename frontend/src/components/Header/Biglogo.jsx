import React from 'react'
import biglogo from './big_logo.svg';
import bigbutton from './big_button.svg';
import './biglogo.css';


const Biglogo = () => {
  return (
    <div>
       <section className='big-logo'>
           <img className='big-logo-img' src={biglogo} alt=" Mew and Fur ever" />
           <a href="#aL-gralContainer"><img className='big-logo-img' src={bigbutton} alt="boton"/></a>
       </section>
    </div>
  )
}

export default Biglogo
