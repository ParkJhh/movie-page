import { createApp } from 'vue'
import { router } from './router/index.js';
import App from './App.vue'
import axios from 'axios'
import moviePlugin from './assets/moviePlugin.js';
import 'bootstrap/dist/css/bootstrap.min.css';


const app = createApp(App)
app.config.globalProperties.axios = axios
app.use(router)
app.use(moviePlugin)
app.mount('#app')
