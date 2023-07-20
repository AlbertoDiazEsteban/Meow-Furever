import './detailCard.css'

export default function DetailCard() {
  return (
    <section className='animal-detail-container'>
      <div className='card-gallery'>
        <div className='image-cover'>
          <img src='/foto4.jpg' alt='Dog portrait' />
        </div>
        <div className='card-image-list'>
          <img src='/foto4.jpg' alt='Dog portrait' />
          <img src='/foto4.jpg' alt='Dog portrait' />
          <img src='/foto4.jpg' alt='Dog portrait' />
          <img src='/foto4.jpg' alt='Dog portrait' />
        </div>
      </div>

      <div className='card-content'>
        <h3>Conoce a..</h3>
        <p className='content-label'>Nombre: </p>
        <p className='content-name'>Ely</p>
        <p className='content-label'>Raza: </p>
        <p className='content-field'>Corgi:</p>
        <p className='content-label'>Sexo: </p>
        <p className='content-field'>Hembra</p>
        <p className='content-label'>Lleva en adopción desde:</p>
        <p className='content-field'>2020-03-15</p>

        <button>Adoptar</button>
      </div>
    </section>
  );
}
