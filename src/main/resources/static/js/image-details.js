'use strict'

class ImageDetails {
    constructor(details) {
        this._imageId = details.imageId;
        this._title = details.title;
        this._albumId = details.albumId;
        this._render();
    }

    _render(){
        this._el = document.createElement('div');
        this._el.innerHTML =`<span><b>image id:</b> ${this._imageId}<br/>
                              <b>title: </b>${this._title}<br/>
                              <b>album id:</b> ${this._albumId}<br/>
                        </span>`;
    }

    get element() {
        return this._el;
    }
}