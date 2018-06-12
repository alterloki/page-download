import React from 'react';
import { Card, Button, CardImg, CardTitle, CardText, CardColumns,
    CardSubtitle, CardBody } from 'reactstrap';


export default class PipelineDeck extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <CardColumns>
                <Card>
                    <CardBody>
                        <CardTitle>Pipeline1</CardTitle>
                        <CardSubtitle>Pipeline type</CardSubtitle>
                        <CardText>Pipeline description</CardText>
                        <Button>Edit</Button>
                    </CardBody>
                </Card>
                <Card>
                    <CardBody>
                        <CardTitle>Pipeline2</CardTitle>
                        <CardSubtitle>Pipeline type</CardSubtitle>
                        <CardText>Pipeline description</CardText>
                        <Button>Edit</Button>
                    </CardBody>
                </Card>
                <Card>
                    <CardBody>
                        <CardTitle>Pipeline3</CardTitle>
                        <CardSubtitle>Pipeline type</CardSubtitle>
                        <CardText>Pipeline description</CardText>
                        <Button>Edit</Button>
                    </CardBody>
                </Card>
                <Card>
                    <CardBody>
                        <CardTitle>Pipeline4</CardTitle>
                        <CardSubtitle>Pipeline type</CardSubtitle>
                        <CardText>Pipeline description</CardText>
                        <Button>Edit</Button>
                    </CardBody>
                </Card>
            </CardColumns>
        );
    }
}