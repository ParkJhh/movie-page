import { createRouter, createWebHistory } from 'vue-router'
import Mainpage from '@/components/Mainpage.vue'
import Login from '@/components/Login.vue'
import Signup from '@/components/Signup.vue'
import Community from '@/components/Community.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: Mainpage
  },
  {
    path: '/login',
    name: 'login',
    component: Login
  },
  {
    path: '/signup',
    name: 'signup',
    component: Signup
  },
  {
    path: '/community',
    name: 'community',
    component: Community
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export { router };
