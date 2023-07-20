import React from 'react'
import "./footer.css"


const Footer = () => {
    return (
        <>
            <footer id='footer'>
                <div className='flex-item-left'>
                    <form>
                        <h1>¡Contáctanos!</h1>
                        <input type="text" id="name" name="name" placeholder="Nombre" />
                        <input type="text" id="email" name="email" placeholder="Email" />
                        <textarea>Mensaje</textarea>
                        <div>
                            <button className="btn-submit" type="submit">Enviar</button>
                        </div>
                    </form>
                </div>
                <div className='flex-item-right'>
                    <h5>Redes Sociales</h5>
                    <div className="social-links">
                        <a href="#"><img src="/assets/icons/icons8-twitter-55.png" alt="icon-twitter"></img></a>
                        <a href="#"><img src="/assets/icons/icons8-facebook-nuevo-55.png" alt="icon-facebook"></img></a>
                        <a href="#"><img src="/assets/icons/icons8-instagram-55.png" alt="icon-instagram"></img></a>
                        <a href="#"><img src="/assets/icons/icons8-youtube-play-55.png" alt="icon-youtube"></img></a>
                        <div className='contacts'>
                            <div>
                                <h5>Teléfono</h5>
                                <h4>0000-000-000</h4>
                            </div>
                            <div>
                                <h5>Email</h5>
                                <h4>meow&furever@contact.com</h4>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
            <div className='copyright'>
                <h4>Meow&Furever todos los derechos reservados @2023</h4>
            </div>
        </>
    );
}

export default Footer