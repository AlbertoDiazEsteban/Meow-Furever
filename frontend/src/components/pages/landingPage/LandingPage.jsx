import Banner from "../../Banner/Banner";
import Header from "../../Header/Header";
import AnimalsList from "../../animalsList/AnimalsList";
import Dropdown from "../Dropdown/Dropdown"

function LandingPage() {
  return (
    <>
    <Header />
    <Banner />;
    <Dropdown/>
    <AnimalsList />
    
  </>
    
  )
}

export default LandingPage;
