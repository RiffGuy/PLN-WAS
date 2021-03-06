import React from 'react';

// react-bootstrap
import { ListGroup, Dropdown, Form } from 'react-bootstrap';

// third party
import { Link } from 'react-router-dom';
import FeatherIcon from 'feather-icons-react';

// assets
import avatar from 'assets/images/user/avatar.jpg';

// -----------------------|| NAV RIGHT ||-----------------------//
const NavRight = () => (
    <ListGroup as="ul" bsPrefix=" " className="list-unstyled">
        <ListGroup.Item as="li" bsPrefix=" " className="pc-h-item">
            <Dropdown>
                <Dropdown.Toggle as="a" variant="link" className="pc-head-link arrow-none me-0">
                    <i className="material-icons-two-tone">search</i>
                </Dropdown.Toggle>
                <Dropdown.Menu className="dropdown-menu-end pc-h-dropdown drp-search">
                    <Form className="px-3">
                        <div className="form-group mb-0 d-flex align-items-center">
                            <FeatherIcon icon="search" />
                            <Form.Control type="search" className="border-0 shadow-none" placeholder="Search here. . ." />
                        </div>
                    </Form>
                </Dropdown.Menu>
            </Dropdown>
        </ListGroup.Item>
        <ListGroup.Item as="li" bsPrefix=" " className="pc-h-item">
            <Dropdown className="drp-user">
                <Dropdown.Toggle as="a" variant="link" className="pc-head-link arrow-none me-0">
                    <img src={avatar} alt="userimage" className="user-avtar" />
                    <span>
                        <span className="user-name">RiffRain</span>
                        <span className="user-desc">Administrator</span>
                    </span>
                </Dropdown.Toggle>
                <Dropdown.Menu className="dropdown-menu-end pc-h-dropdown">
                    <Dropdown.Header className="pro-head">
                        <h5 className="text-overflow m-0">
                            <span className="badge bg-light-primary">
                                <a
                                    href="https://dashboardkit.io/product/dashboardkit-reactjs-admin-template/"
                                    target="_blank"
                                    rel="noreferrer"
                                >
                                    Upgrade To Pro
                                </a>
                            </span>
                        </h5>
                    </Dropdown.Header>
                    <Link to="/users/user-profile" className="dropdown-item">
                        <i className="feather icon-user" /> Profile
                    </Link>
                    <Link to="/auth/signin-2" className="dropdown-item">
                        <i className="feather icon-lock" /> Lock Screen
                    </Link>
                    <Link to="#" className="dropdown-item">
                        <i className="material-icons-two-tone">chrome_reader_mode</i> Logout
                    </Link>
                </Dropdown.Menu>
            </Dropdown>
        </ListGroup.Item>
    </ListGroup>
);

export default NavRight;
