import React, { useState, useEffect } from 'react';
import './App.css';

function Albums(){
 const [album, setAlbum] = useState([]);
  const [error, setError] = useState({ error: false, message: "" });
  const [loading, setLoading] = useState(true);

   const handleFetch = async () => {
      try {
        const response = await fetch('http://localhost:8080/api/albums');
        if (response.status !== 200) {
                throw new error("oops");
              }
        const dataAlbum = await response.json();
        setAlbum(dataAlbum)
        console.log(response);
        setLoading(false);
      } catch (error) {
        setError({ error: true, message: error.message });
      }
    };

  useEffect(() => {
 handleFetch();
  }, []);

return (
        <div>
            <h1>Albums Available on Jukebox</h1>
            {album.map((data) => {
                return <div>

                 <p>{data.albumTitle}</p>
                </div>;
            })}
        </div>
    );
    }

    export default Albums;