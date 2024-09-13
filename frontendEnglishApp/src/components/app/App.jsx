import { Routes, Route, BrowserRouter } from 'react-router-dom';
import PageNotFound from "../../pages/page-not-found/page-not-found";
import ShowStudents from "../../pages/show-students/show-students";
import HomePage from "../../pages/home-page/home-page"

const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/students" element={<ShowStudents />} />
        <Route path="*" element={<PageNotFound />} />
      </Routes>
    </BrowserRouter>
  )
};

export default App;
