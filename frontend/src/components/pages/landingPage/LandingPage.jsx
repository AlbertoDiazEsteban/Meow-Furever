import Banner from "../../Banner/Banner";
import AnimalsList from "../../animalsList/AnimalsList"
import Dropdown from "../Dropdown/Dropdown"

function LandingPage() {
  return (
    <>
      <Banner />;
      <Dropdown/>
      <AnimalsList />
    </>
  );
}

export default LandingPage;