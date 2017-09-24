'use strict'

let loadImageInfo = function () {
    document.addEventListener("DOMContentLoaded", ready);

    function ready() {
        load();
    }

    function load() {
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'load-info', true);

        xhr.onload = function (e) {
            if (xhr.status != 200) {
                console.error(xhr.status + ': ' + xhr.statusText);
            } else {
                let imageInfoArray = JSON.parse((xhr.responseText));
                new ImageInfo(document.body, imageInfoArray);
            }
        };

        xhr.onerror = function (e) {
            console.error(xhr.statusText);
        };

        xhr.send();
    }
};

loadImageInfo();