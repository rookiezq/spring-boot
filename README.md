# spring-boot

springboot学习历程

## Spring MVC
### 注解

#### RequestMapping和GetMapping区别

GetMapping等价于RequestMapping(method=RequestMethod=GET),同理还有PostMapping、PutMapping

#### RestController和Controller区别

前者多了个ResponseBody，将数据写入reponse的body中，转为json

#### RequestBody

请求参数在request的body中，一般为具体的对象



## Vue

### 常用指令

#### 1. v-bind

- 变量绑定
- `v-bind:value="msg"`等价于`:value="msg"`

#### 2. v-on

- 事件绑定
- `v-on:click="show"`等价于`@click="show"`
- show为*methods*中的方法函数

#### 3. v-model

- 双向绑定，同时改变
- `<input type="text" v-model="msg">`

#### 4. v-for

- 循环遍历
- `<p v-for="item, i in list" :key="item.id">索引：{{i}} --- 值：{{item}}</p>`
- `:key`必须加上

#### 5. v-show和v-if

- 条件判断
- `<h3 v-if="flag">这是v-if控制的元素</h3>`

#### 6. Vue.componet

- 模板

- ```html
  //js
  <script>
  // 定义名为 todo-item 的新组件
  Vue.component('todo-item', {
    template: '<li>这是个待办项</li>'
  })
  var app = new Vue(...)
  </script>
  
  //html
  <ol>
    <!-- 创建一个 todo-item 组件的实例 -->
    <todo-item></todo-item>
  </ol>
  ```

#### 7. filter

- 全局过滤 `Vue.filter('过滤器名称', function(){})`

- 私有过滤 

  ```vue
  new Vue()({
  	filters: {
  		过滤器名称: function(){}
  	}
  })
  ```

#### 8. 自定义按键

- @keyup.按键别名 = "要调用的方法名"
- `<input type="text" @keyup.enter="open">`



## 其他
### 浏览器发送GET请求情况
- 直接在地址栏中输入地址
- 点击链接
- 表单默认提交方式

### 浏览器发送POST请求情况
- 将表单的method设置为post