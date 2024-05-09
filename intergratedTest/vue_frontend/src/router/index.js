import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/user',
      name: 'user',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/UserView.vue')
    },
    {
      path: '/movie',
      name: 'movie',

      component: () => import('../views/MovieView.vue')
    },
    {
      path: '/login',
      name: 'login',

      component: () => import('../views/LoginView.vue')
    },
    {
      path: '/popularPost',
      name: 'popularPost',

      component: () => import('../views/PopularPostView.vue')
    },
    {
      path: '/freeBoard',
      name: 'freeBoard',

      component: () => import('../views/FreeBoardView.vue')
    }
  ]
})

export default router
