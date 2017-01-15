var path = require('path');
//定义了一些文件夹的路径
var ROOT_PATH = path.resolve(__dirname);
var BUILD_PATH = path.resolve(ROOT_PATH, 'build');
//模块 声明别的模块在这里写
var PUBLIC = path.resolve(ROOT_PATH, 'module/app/app.js');//公用模块
module.exports = {
  //项目的文件夹 可以直接用文件夹名称 默认会找index.js 也可以确定是哪个文件名字
  entry: PUBLIC,
  //输出的文件名 合并以后的js会命名为bundle.js
  output: {
    path: BUILD_PATH,
    filename: 'bundle.js'
  },
  devServer: {
    historyApiFallback: true,
    hot: true,
    inline: true,
    progress: true,
  },
  module:{
    loaders:[
      {test:/\.scss$/,loader:'style!css'},
      {test:/\.css$/,loader:'style!css'},
      {test: /\.jsx?$/, loader: 'babel'},
    ]
  },
  resolve: {
    extensions: ['', '.js', '.vue'],
    alias: {
      'Vue': 'vue/dist/vue.js',
    }
  },
};