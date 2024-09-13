import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './components/app/App.jsx'
import { Helmet } from 'react-helmet';

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Helmet>
      <title>Обучение английскому</title>
      <meta name="description" content="Описание страницы" />
      <meta name="keywords" content="" />
    </Helmet>
    <App />
  </StrictMode>,
)
