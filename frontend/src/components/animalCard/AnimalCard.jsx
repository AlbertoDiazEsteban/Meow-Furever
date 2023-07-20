import "./animalCard.css";

function AnimalCard(props) {
  return (
    <>
      <div className="aC-cardContainer">
          <img src='/imgs/perrete.png' alt='perrinchi'/>
          <img id="aC-imgContainer" src= {props.image} alt="perrete"/>
          <div className="ac-cardText">
            <h3 className={props.title}>{props.contentTitle}</h3>
            <hr />
          <p className={props.text}>{props.contentText}</p>
        </div>
        
      </div>
    </>
  )
}

export default AnimalCard