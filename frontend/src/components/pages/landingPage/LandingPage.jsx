<<<<<<< HEAD
//import AnimalCard from "../../animalCard/AnimalCard"
import AnimalsList from "../../animalsList/AnimalsList"



function LandingPage() {
  return (
    <div>
        <AnimalsList />
    </div>
  )
=======
import Banner from "../../Banner/Banner";
import AnimalCard from "../../animalCard/AnimalCard";
//import perrete from "../../../assets/images/perrete"
import Header from "../../Header/Header";

function LandingPage() {
  return (
    <>
      <Header />
      <Banner />;
      <AnimalCard
        contentTitle={"Panda"}
        contentText={"Pinscher-Hembra"}
      ></AnimalCard>
    </>
  );
>>>>>>> 292169839b4b8bbd18a433ba63a1c980559eb476
}

export default LandingPage;
