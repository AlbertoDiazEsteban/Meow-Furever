import React, { useEffect, useState } from "react";
import "./Shelters.css";
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
      <Banner shortMode={true} />
      {shelters.length === 0 ? (
        <p>Loading ...</p>
      ) : (
        <>
        <h2>Protectoras con las que trabajamos</h2>
          <div className="card-wrapper">
            {shelters.map((shelter) => {
              return (
                <div className="card" key={shelter.id}>
                  <img src={`${process.env.PUBLIC_URL}${shelter.imgUrl}`} />
                  <div className="container">
                    <h4>
                      <b>{shelter.name}</b>
                    </h4>
                    <button>Contactanos</button>
                    <div>
                      <img
                        className="facebook"
                        src={`${process.env.PUBLIC_URL}/assets/img/banner/facebook.png`}
                      />
                      <img
                        className="twitter"
                        src={`${process.env.PUBLIC_URL}/assets/img/banner/twitter.png`}
                      />
                      <img
                        className="instagram"
                        src={`${process.env.PUBLIC_URL}/assets/img/banner/instagram.png`}
                      />
                    </div>
                  </div>
                </div>
              );
            })}
          </div>
        </>
      )}
    </>
  );
}

export default Shelters;
