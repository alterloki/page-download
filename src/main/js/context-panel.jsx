import React from 'react';
import {Button, Jumbotron} from 'reactstrap';

const ContentPanel = (props) => {
    return (
        <div>
            <Jumbotron>
                <h1 className="display-3">My Pipelines</h1>
                <p className="lead">Here you can see a list of pipelines. Pipelines is a consequential list of
                    simple tasks. Also here you can create yours pipeline.</p>
                <p className="lead">
                    <Button color="primary">Create new</Button>
                </p>
            </Jumbotron>
        </div>
    );
};

export default ContentPanel