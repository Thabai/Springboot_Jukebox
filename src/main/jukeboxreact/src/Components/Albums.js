import React, { useState, useEffect } from 'react';
import AlbumSongs from './AlbumSongs.js';
import '../App.css';

const Albums = () => {
 const [album, setAlbum] = useState([]);
  const [error, setError] = useState({ error: false, message: "" });
  const [loading, setLoading] = useState(true);

   const handleFetch = async () => {
      try {
        const response = await fetch(`${process.env.REACT_APP_REST_API}api/albums`);
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

  console.log(album);

return (
        <div>
            <h1>Albums Available on Jukebox</h1>
            {album.map((data, index) => {
                return <div className="album_container" key={index}>
                <h2>Album Title: {data.albumTitle}</h2>
                <AlbumSongs albumSongs={data.albumSongs} />
                </div>;
            })}
       </div>
    );
    }

export default Albums;