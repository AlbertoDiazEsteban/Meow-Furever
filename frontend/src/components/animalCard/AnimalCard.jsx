import "./animalCard.css";




function AnimalCard(props) {
  return (
    <>
   
   <section className="aC-cardContainer">
        <img id="aC-imgContainer" src= {props.image} alt="perrete"/>
    
      <div className="ac-cardText">
        <h3 className={props.title}>{props.contentTitle}</h3>
        <hr />
        <p className={props.text}>{props.contentText}</p>
      </div>
      
    </section>
    </>
  )
}

export default AnimalCard