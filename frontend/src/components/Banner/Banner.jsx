import React, { useState, useEffect } from "react";

import "./Banner.css";
import Carousel from "../Carousel/Carousel";

const Banner = () => {
  const [slides, setSlides] = useState([]);
  useEffect(() => {
    const requestOptions = {
      method: "GET",
    };

    fetch("http://localhost:8000/shelters", requestOptions)
      .then((response) => response.json())
      .then((result) =>
        setSlides(
          result.map((item, index) => {
            const prev = index === 0 ? result.length - 1 : index - 1;
            const next = index === result.length - 1 ? 0 : index + 1;
            return {
              content: () => (
                <>
                  {/* conectar con pagina de protectoras */}
                  <a href="#">
                    <img
                      src={`${process.env.PUBLIC_URL}${result[prev].imgUrl}`}
                    />
                  </a>

                  <a href="#">
                    <img src={`${process.env.PUBLIC_URL}${item.imgUrl}`} />
                  </a>

                  <a href="#">
                    <img
                      src={`${process.env.PUBLIC_URL}${result[next].imgUrl}`}
                    />
                  </a>
                </>
              ),
            };
          })
        )
      )
      .catch((error) => console.log("error", error));
  }, []);

  if (slides.length === 0) {
    return <p>Cargando datos...</p>;
  }

  return (
    <div className="banner">
      <div
        className="banner-image top"
        style={{
          backgroundImage: `linear-gradient(to bottom, rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0)), url('${process.env.PUBLIC_URL}/assets/img/banner/id1.png')`,
        }}
      />
      <div className="carousel-wrapper">
        <h2>Protectoras con las que trabajamos</h2>
        <div className="desktop">
          <Carousel
            slides={slides}
            speed={3000}
            slideWidth={470}
            slideHeight={100}
            indicator={false}
            manualMode
          />
        </div>
        <div className="mobile">
          <Carousel
            slides={slides}
            speed={3000}
            slideWidth={310}
            slideHeight={100}
            indicator={false}
            manualMode
          />
        </div>
      </div>
      <div
        className="banner-image bottom"
        style={{
          backgroundImage: `linear-gradient(to bottom, rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0)), url('${process.env.PUBLIC_URL}/assets/img/banner/id2.png')`,
        }}
      />
    </div>
  );
};

export default Banner;
