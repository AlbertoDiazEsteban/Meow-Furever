import { BrowserRouter, Routes, Route } from "react-router-dom";
import LandingPage from "../components/pages/landingPage/LandingPage";
import GalleryPage from "../components/pages/GalleryPage/GalleryPage";
import Shelters from "../components/pages/shelters/Shelters";



const Router = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element= {<LandingPage/>}></Route>
                <Route path="/GalleryPage" element= {<GalleryPage/>}></Route>
                <Route path="/shelters" element= {<Shelters/>}></Route>
            </Routes>
        </BrowserRouter>
    );
};

export default Router;