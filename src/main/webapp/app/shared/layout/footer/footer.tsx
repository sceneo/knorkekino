import './footer.scss';

import React from 'react';

import { Col, Row } from 'reactstrap';

const Footer = () => (
  <div className="footer page-content">
    <Row>
      <Col md="12">
        <p>Knorke Kino (Example for ArchUnit usage) - Made with JHipster by Tobias Kunz</p>
      </Col>
    </Row>
  </div>
);

export default Footer;
