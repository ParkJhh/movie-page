const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  devServer: {
    proxy: {
      "/api": {	
        target: "http://localhost:8080", // 프록시를 설정할 도메인
        changeOrigin: true,
      }, 
    }
  },
  transpileDependencies: true,
  lintOnSave: false
})
