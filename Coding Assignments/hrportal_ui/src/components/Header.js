import React, {Component} from 'react';
class Header extends Component {
    render() {
        return (
            <div className="header">
                <a href="/home">Home</a>
                <a href="/about">About</a>
                <a href="/policy">Policy</a>
                <a href="/suggestion">suggestion</a>
                <a href="/login">suggestion</a>
            </div>
        );
    }
}
export default Header;