import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import yuyueguahao from '@/views/modules/yuyueguahao/list'
    import quxiaoyuyue from '@/views/modules/quxiaoyuyue/list'
    import chufangxinxi from '@/views/modules/chufangxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import huanzhexinxi from '@/views/modules/huanzhexinxi/list'
    import yiyuanjieshao from '@/views/modules/yiyuanjieshao/list'
    import messages from '@/views/modules/messages/list'
    import yonghuwenzhen from '@/views/modules/yonghuwenzhen/list'
    import wenzhenhuifu from '@/views/modules/wenzhenhuifu/list'
    import keshileixing from '@/views/modules/keshileixing/list'
    import yisheng from '@/views/modules/yisheng/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/yuyueguahao',
        name: '预约挂号',
        component: yuyueguahao
      }
      ,{
	path: '/quxiaoyuyue',
        name: '取消预约',
        component: quxiaoyuyue
      }
      ,{
	path: '/chufangxinxi',
        name: '处方信息',
        component: chufangxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/huanzhexinxi',
        name: '患者信息',
        component: huanzhexinxi
      }
      ,{
	path: '/yiyuanjieshao',
        name: '医院介绍',
        component: yiyuanjieshao
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/yonghuwenzhen',
        name: '用户问诊',
        component: yonghuwenzhen
      }
      ,{
	path: '/wenzhenhuifu',
        name: '问诊回复',
        component: wenzhenhuifu
      }
      ,{
	path: '/keshileixing',
        name: '科室类型',
        component: keshileixing
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
