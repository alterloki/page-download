import AppNavigation from "./navbar.jsx";
import ContentPanel from "./context-panel.jsx";
import PipelineDeck from "./pipeline-deck.jsx";
import {BrowserRouter} from 'react-router-dom';

const React = require('react');
const ReactDOM = require('react-dom');

const client = require('./client.jsx');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {pipelines: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/pipeline'}).done(response => {
            this.setState({pipelines: response.entity._embedded.pipelines});
        });
    }

    render() {
        return (
            <div>
                <AppNavigation/>
                <ContentPanel/>
                <PipelineDeck/>
            </div>
        )
    }
}

ReactDOM.render(
    (<BrowserRouter>
        <App/>
    </BrowserRouter>), document.getElementById('react'));