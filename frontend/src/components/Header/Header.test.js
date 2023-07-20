// Header.test.js
import React from 'react';
import { render, fireEvent } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect'; 

import Header from './Header';

test('renders header with logo and navigation links', () => {
  const { getByAltText, getByText, getByTestId } = render(<Header />);
  
  
  const logoElement = getByAltText('logo');
  expect(logoElement).toBeInTheDocument();

  const navLinks = ['Soy protectora', 'Quiero adoptar', 'Nosotros', 'Contacto'];
  navLinks.forEach(linkText => {
    const linkElement = getByText(linkText);
    expect(linkElement).toBeInTheDocument();
  });
});
