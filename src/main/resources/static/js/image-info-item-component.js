'use strict'

class ImageInfoItemComponent {
    constructor(imageInfo) {
        this._render(imageInfo);
    }

    _render(imageInfo) {
        let CLASS_IMAGE = 'item-image';
        let CLASS_DESCRIPTION = 'item-description';
        let CLASS_ITEM = 'image-info-item';

        this._el = document.createElement('div');
        this._el.classList.add(CLASS_ITEM);

        let imageElement = (new ImageComponent(imageInfo.url, imageInfo.thumbnailUrl)).element;
        imageElement.classList.add(CLASS_IMAGE);
        this._el.appendChild(imageElement);
        let imageDescription = (new ImageDetailsComponent({imageId: imageInfo.id, title: imageInfo.title, albumId: imageInfo.albumId})).element;
        imageDescription.classList.add(CLASS_DESCRIPTION);
        this._el.appendChild(imageDescription);


    }

    get element() {
        return this._el;
    }

}