import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
// import UserLayout from './pages/user/UserLayout.jsx';
import './index.css'
import { Provider } from 'react-redux';
import { PersistGate } from 'redux-persist/integration/react';
import {store,persistor} from './redux/store.jsx';
// import Joblogin from './pages/auth/Joblogin'
// import JobRegister from './pages/auth/JobRegister'
// import TDrawer from './pages/user/sidebar.jsx'

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <Provider store={store}>
    <PersistGate loading={null} persistor={persistor}>
    <App/>
    </PersistGate>
    </Provider>
  </React.StrictMode>,
)
