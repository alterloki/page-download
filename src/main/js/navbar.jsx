import React from 'react';
import {Navbar, NavbarBrand} from 'reactstrap';

export default class AppNavigation extends React.Component {
    constructor(props) {
        super(props);

        this.toggle = this.toggle.bind(this);
        this.state = {
            isOpen: false
        };
    }

    toggle() {
        this.setState({
            isOpen: !this.state.isOpen
        });
    }

    render() {
        return (
            <div>
                <Navbar color="light" light expand="md">
                    <NavbarBrand href="/">Pipelines</NavbarBrand>
                </Navbar>
            </div>
        );
    }
}