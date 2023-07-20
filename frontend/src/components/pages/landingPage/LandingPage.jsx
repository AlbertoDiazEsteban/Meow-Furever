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
}

export default LandingPage;
