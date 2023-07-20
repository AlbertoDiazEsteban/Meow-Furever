import './AnimalsList.css';
import AnimalCard from '../animalCard/AnimalCard';
import AnimalCardService from '../../Configuration/AnimalCardService';

function AnimalsList(){
    const data = AnimalCardService ().sort((a, b) => b.family.imgUrl - a.family.imgUrl);
    console.log(data);
    return (
        <>
            <div className="aL-gralContainer">
                    {data.slice(0,12).map((animals)=>(
                    <AnimalCard image={animals.family.imgUrl} contentTitle={animals.name} contentText={animals.type} />
                )
                )}
            </div>
            
        </>
    )
}

export default AnimalsList;
