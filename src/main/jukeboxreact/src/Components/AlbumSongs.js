import AlbumCard from './AlbumCard';
import React from 'react';

const AlbumSongs = ({albumSongs}) => {

 return (
     <div>
     {albumSongs
          .map((data, index) => {
             return <AlbumCard key={index} {...data}/>;
        })}
      </div>
 );
};

export default AlbumSongs;