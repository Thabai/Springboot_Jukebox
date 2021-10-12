import '../App.css';

const AlbumCard = ({index, songTrack, songArtist}) => {
    return (

            <div key={index} className="song_container">
                <h3>Track name: {songTrack}</h3>
                  <h4>Track Artist: {songArtist}</h4>
            </div>
    );
};

export default AlbumCard;