import  '../../public/public.js';
import Vue from 'Vue';
let $ = require('jquery');
let app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue!',
        items: [
            {firstName: 'du',lastName:'jiuLing',userName:'duJiuLing1'},
            {firstName: 'du',lastName:'jiuLing',userName:'duJiuLing2'},
            {firstName: 'du',lastName:'jiuLing',userName:'duJiuLing3'},
            {firstName: 'du',lastName:'jiuLing',userName:'duJiuLing4'},
            {firstName: 'du',lastName:'jiuLing',userName:'duJiuLing5'},
        ]
    }
});
$("#app").show();


