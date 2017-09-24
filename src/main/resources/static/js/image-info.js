'use strict';

class ImageInfo {
    constructor(element, imageInfoArray){
        this._el = element;
        this._render(imageInfoArray);
    }

    _render(imageInfoArray){
        imageInfoArray.forEach((imageInfo) => {
            this._el.appendChild((new ImageInfoItem(imageInfo)).element);
        });
    }

}
