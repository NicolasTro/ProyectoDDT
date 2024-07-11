import Home from "./Routes/Home"
import Ddt from "./Routes/Ddt"
import { routes } from "./utils/Routes";
import { Routes, Route, Navigate } from "react-router-dom"
import { useContextGlobalDentist } from "./Context/Context";
import Layout from "./Layout/Layout";
import { Tercista } from "./Routes/Tercista";
import { Clientes } from "./Routes/Clientes";
import Estado from "./Routes/Estado";
import { Articulos } from "./Routes/Articulos";
import { Detail } from "./Routes/Detail";
function App() {

  return (
    <>
      <Routes>
        <Route element={<Layout />} >
          <Route path={routes.Home} element={<Home/>} />
          <Route path={routes.Cliente} element={<Clientes/>} />
          <Route path={routes.Ddt} element={<Ddt/>} />
          <Route path={routes.Articulos} element={<Articulos />} />
          <Route path={routes.Tercista} element={<Tercista />} />
          <Route path={routes.estados} element={<Estado />} />
          <Route path="/detail/:id" element={<Detail />} />
          <Route path="/" element={<Navigate to={routes.Home} />} />
          <Route path="*" element={<h1>Error 404 - Page not found</h1>} />
        </Route>
      </Routes>

    </>
  )
}

export default App
