import {Link} from 'react-router-dom';

export const MatchDetailCard = ({teamName,match}) => {
  const otherTeam = match.team1 == teamName ? match.team2 : match.team1;
  const otherTeamRoute=`/teams/${otherTeam}`;

    if(match==null) {
        return null}
    return (
      <div className="MatchDetailCard">
        <h3>Latest Matches</h3>
        <h1> vs <Link to={otherTeamRoute}>{otherTeam}</Link></h1>
        <h2>{match.date}</h2>   
        <h3>at {match.venue}</h3>   
        <h2>{match.matchWinner} won by {match.resultMargin} {match.result}</h2>   
      </div>
    );
  }
  
  
  