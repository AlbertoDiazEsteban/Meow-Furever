import React, { useEffect, useState } from "react";
import "./Shelters.css";
import Header from "../../Header/Header";
import Banner from "../../Banner/Banner";

function Shelters() {
  const [shelters, setShelters] = useState([]);
  useEffect(() => {
    const requestOptions = {
      method: "GET",
    };

    fetch("http://localhost:8000/shelters", requestOptions)
      .then((response) => response.json())
      .then((result) => setShelters(result))
      .catch((error) => console.log("error", error));
  }, []);

  return (
    <>
      <Header />
      <Banner shortMode={true} />
      {shelters.length === 0 ? (
        <p>Loading ...</p>
      ) : (
        shelters.map((shelter) => {
          return (
            <div className="" key={shelter.id}>
              <p>{shelter.name}</p>
              <img src={`${process.env.PUBLIC_URL}${shelter.imgUrl}`} />
            </div>
          );
        })
      )}
    </>
  );
}

export default Shelters;
