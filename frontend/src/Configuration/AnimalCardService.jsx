import useFetch from "../components/hooks/useFetch";
import DynamicUrl from "../components/services/DynamicUrl";

const AnimalCardService = () => {
    const data = useFetch (`${DynamicUrl}/animals`);
        return data;    
}

export default AnimalCardService;