import Vue from 'vue'
import Router from 'vue-router'
import Posts from './views/Posts.vue'
import PostNew from './views/PostNew.vue'
import PostDetail from './views/PostDetail.vue'
  
Vue.use(Router) //플러그인 등록


const Foo = { template: '<div>foo</div>' }
const Home = { template: '<div>Home</div>' }

export default new Router({
routes: [
  { path: '/foo', component: Foo,},
  { 
    path: '/posts',
    component: Posts,
    children: [
      { path: 'new', component: PostNew},
      { path: ':id', name: 'post', component: PostDetail} //PostDetail
    ]
  },
  {
    path: '/about',
    component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
  },
  {
    path: '/home',
    component: Home
  }
]
})
