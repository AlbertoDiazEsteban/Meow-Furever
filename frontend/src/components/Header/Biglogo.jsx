import React from 'react'
import biglogo from './big_logo.svg';
import './biglogo.css';


const Biglogo = () => {
  return (
    <div>
       <section className='big-logo'>
           <img className='big-logo-img' src={biglogo} alt=" Mew and Fur ever" />
           <button className='big-logo-btn'></button>
       </section>
    </div>
  )
}

export default Biglogo
