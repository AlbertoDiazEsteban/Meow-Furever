import Banner from "../../Banner/Banner";
import Header from "../../Header/Header";
import AnimalsList from "../../animalsList/AnimalsList"

function LandingPage() {
  return (
    <>
      <Header />
      <Banner />;
      <AnimalsList />
    </>
  );
}

export default LandingPage;
