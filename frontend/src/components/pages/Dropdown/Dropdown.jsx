import "./dropdown.css"
import arrow from "./dropdown_arrow.svg"

function Dropdown (props) {
    return (
      <div className="dropdown_container">
        <h2>Encuentra a tú compañero ideal</h2>
        <div className="botones-desplegables">
          <button className="dropdown-boton">Comunidad <br></br> Autonoma <img src={arrow} alt="dropdown-arrow" /></button> 
          <button className="dropdown-boton">Tipo de mascota <img src={arrow} alt="dropdown-arrow" /></button>
          <button className="dropdown-boton">Sexo <img src={arrow} alt="dropdown-arrow" /></button>
          <button className="dropdown-boton-dk">Buscar</button>
        </div>
      </div>
    );
  };
  
  export default Dropdown;
 