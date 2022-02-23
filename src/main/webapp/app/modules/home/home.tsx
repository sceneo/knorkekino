import './home.scss';

import React from 'react';
import { Link } from 'react-router-dom';

import { Row, Col, Alert } from 'reactstrap';

import { useAppSelector } from 'app/config/store';

export const Home = () => {
  const account = useAppSelector(state => state.authentication.account);

  return (
    <div>
      <h2>ArchUnit Workshop</h2>
      <span className="archunit" />
    </div>
  );
};

export default Home;
