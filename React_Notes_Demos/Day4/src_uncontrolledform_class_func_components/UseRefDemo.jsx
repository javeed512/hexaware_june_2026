import React, {
    useRef
} from 'react';

const UseRefDemo = () => {
    const inputRef = useRef();

    const handleClick = () => {
        alert('Input Value: ' +
            inputRef.current.value);
    };

    return (
        <div>
            <div >
                <input
                    className='form-control'
                    type="text"
                    ref={inputRef}
                />
                <button
                    className="btn btn-danger"
                    onClick={handleClick}
                >
                    Get Input Value
                </button>
            </div>
        </div>
    );
};

export default UseRefDemo;