import { Button } from "@mui/material";
const HomePage = () => {
  return (
    <div>
      <header>
        <h1><center>Welcome To JobXpress</center></h1>
      </header>
      <main>
        <br/><br/><br/><br/>
        <h2 style={{color: "darkblue",fontWeight: "bold"}}><center>Create Big Ideas Worth Rallying Around!!</center></h2>
        <br/>
        <h3 style={{color: "black",fontWeight: "bold"}}><center>Find Jobs that match your profile!</center></h3>
        <br/><br/>
        <div>
        <center>
        <Button
                type="submit"
                variant="contained"
                sx={{ mt: 3, mb: 2 ,backgroundColor: "black"}}
              >
                Want a Job? Browse Me!
        </Button>
        </center>
        </div>
        <br/><br/>
      </main>
    </div>
  );
}

export default HomePage;