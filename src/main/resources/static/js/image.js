'use strict'

class Image {
    constructor(imageUrl, thumbnailUrl) {
        this._imageUrl = imageUrl;
        this._thumbnailUrl = thumbnailUrl;
        this._render();
    }

    _render(){
        this._el = document.createElement('div');
        this._el.innerHTML =`<a href="${this._imageUrl}" target="_blank" >
                        <img src="${this._thumbnailUrl}" height='100'/></a>`;
    }

    get element() {
        return this._el;
    }
}
