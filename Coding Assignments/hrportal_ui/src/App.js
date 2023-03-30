import React from "react";
import { Layout } from "antd";
import { BrowserRouter as Routes, Route, Router} from "react-router-dom";
import Home from "./components/Home"
import About from "./components/About"
import Suggestion from "./components/Suggestion"
import Login from "./components/Login"
import Policy from "./components/Policy"
import Header from "./components/Login"
import './App.css';
// const {Header, Footer, Content}  = Layout;
class App extends React.Component {
  render() {
    return (
      <div className="App">
        <Router>
          <Header></Header>
          <Routes>
            <Route path="/" element={<Home />}/>
            <Route path="/about" element={<About />} />
            <Route path="/sugeestion" element={<Suggestion />} />
            <Route path="/policy" element={<Policy />} />
            <Route path="/login" element={<Login />} />
          </Routes>
        </Router>



        {/* <Layout>
          <Router>
            <Header>
              <AppHeader/>
            </Header>
            <Content>
                <Routes>
                  <Route path="/" element={<Home />}/>
                  <Route path="/about" element={<About />} />
                  <Route path="/sugeestion" element={<Suggestion />} />
                  <Route path="/login" element={<Login />} />
                </Routes>
            </Content>
          </Router>
          <Footer></Footer>
        </Layout> */}
      </div>
    );
  }

}

export default App;
