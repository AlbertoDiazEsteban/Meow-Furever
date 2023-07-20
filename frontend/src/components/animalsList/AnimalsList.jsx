import './AnimalsList.css';
import AnimalCard from '../animalCard/AnimalCard';
import AnimalCardService from '../../Configuration/AnimalCardService';

function AnimalsList(){
    const data = AnimalCardService ().sort((a, b) => b.family.imageUrl - a.family.imageUrl);
    console.log(data);
    return (
        <>
            <div>
                <h2>Listas de animalinchis</h2>
                {data.slice(0,12).map((animals)=>(
                    <AnimalCard image={animals.family.imageUrl} contentTitle={animals.name} contentText={animals.type} />
                )
                )}
            </div>
            
        </>
    )
}

export default AnimalsList;
