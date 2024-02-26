import { Suspense } from "react";
import PropTypes from 'prop-types';
import loadingImage from '../../assets/gif/loading.gif'; 
import '../../assets/css/loading.css';

const LazyLayout = ({ component: Component, ...rest }) => {
    return (
        <Suspense fallback={<div className="suspense-fallback"><img src={loadingImage} alt="Loading..." /></div>}>
            <Component {...rest} />
        </Suspense>
    );
}

LazyLayout.propTypes = {
    component: PropTypes.elementType.isRequired
}

export default LazyLayout;
