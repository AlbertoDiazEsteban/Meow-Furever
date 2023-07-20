import React, { useState, useEffect } from 'react';
import id1Image from '../../../img/id1.png';

const Lalala = () => {
  const [animals, setAnimals] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch('http://localhost:8000/animals');
        if (!response.ok) {
          throw new Error('Network response was not ok.');
        }
        const data = await response.json();
        setAnimals(data);
      } catch (error) {
        console.log('error', error);
      }
    };

    fetchData();
  }, []);

  return (
    <div>
      <h1>Animal List</h1>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Gender</th>
            <th>Family ID</th>
            <th>Continent ID</th>
            <th>Shelter ID</th>
            <th>Date</th>
            <th>Image URL</th>
          </tr>
        </thead>
        <tbody>
          {animals.map(animal => (
            <tr key={animal.id}>
              <td>{animal.id}</td>
              <td>{animal.name}</td>
              <td>{animal.type}</td>
              <td>{animal.gender}</td>
              <td>{animal.family.id}</td>
              <td>{animal.continent.id}</td>
              <td>{animal.shelter.id}</td>
              <td>{animal.date}</td>
              <img src={id1Image} alt="Descripción de la imagen" />
              <td><img src='frontend/public/assets/id1.png' /></td>
              <td><img src='{id1Image}{animal.imgUrl}'/></td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Lalala;
