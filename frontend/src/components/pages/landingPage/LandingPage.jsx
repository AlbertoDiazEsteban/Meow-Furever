import Banner from "../../Banner/Banner";
import AnimalCard from "../../animalCard/AnimalCard";
//import perrete from "../../../assets/images/perrete"

function LandingPage() {
  return (
    <>
      <Banner />;
      <AnimalCard
        contentTitle={"Panda"}
        contentText={"Pinscher-Hembra"}
      ></AnimalCard>
    </>
  );
}

export default LandingPage;
