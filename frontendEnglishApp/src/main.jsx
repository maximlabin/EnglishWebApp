import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import { Helmet } from 'react-helmet';

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Helmet>
      <title>Моя страница</title>
      <meta name="description" content="Описание страницы" />
      <meta name="keywords" content="React, SEO, Метатеги" />
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" />
    </Helmet>
    <App />
  </StrictMode>,
)
