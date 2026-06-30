import { BrowserRouter , Routes , Route, Link , NavLink} from "react-router-dom";
import { Home } from "./Home";
import { Contact } from "./Contact";
import { About } from "./About";

import { Service } from "./Service";

import { ErrorPage } from "./ErrorPage";

export default function  App(){



        return(


                    <>
                    
                        <BrowserRouter> 


                            <center>

                                <Link  style={{margin:"0px 50px"}}  to="/">Home Page</Link>
                                <Link   style={{margin:"0px 50px"}}  to="/contact">Contact Us</Link>
        <NavLink  style={{margin:"0px 50px"}}  to="/about" >Click Here to Know About us</NavLink>

                              
                                
                    <button  className="btn btn-warning"> <Link to="/service">Service</Link></button>
                              



                            </center>

                                <hr />
                        
                        
                            <Routes>

                                    <Route  exact  path="/"  element={<Home />}  ></Route>
                                    <Route   path="/contact"  element={<Contact />}  ></Route>
                                    <Route   path="/about"  element={<About />}  ></Route>
                                    <Route path="/service"  element={ <Service />}></Route>
                                    <Route path="*"  element={ <ErrorPage />}></Route>


                            </Routes>
                        
                        
                        
                        </BrowserRouter>
               
                    
                    
                    
                    </>
              

        )




}