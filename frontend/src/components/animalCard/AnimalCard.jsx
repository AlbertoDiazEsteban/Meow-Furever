import "./animalCard.css";


function AnimalCard(props) {
  
  return (
    <>
      <div className="aC-cardContainer">
          <img id="aC-imgContainer" src={`${process.env.PUBLIC_URL}/assets${props.image}`} alt="animal"/>
          <div className="ac-cardText">
            <h3 className={props.title}>{props.contentTitle}</h3>
            <hr />
          <p className={props.text} id="ac-ctss">{props.contentText}</p>
          <button className="aC-btn" type="button"> Adoptar
          </button>
        </div>
        </div>
    </>
  )
}
export default AnimalCard;