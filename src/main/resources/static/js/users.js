// 设置全局根域名
//Vue.http.options.root = 'http://localhost:8080/';

//设置全局表单提交格式
Vue.http.options.emulateJSON = true;

// 实例化Vue
new Vue({
    el: '#app',
    data: {
        username: '',
        list: []
    },
    created() {
        // 因为进入列表页面就需要在列表中显示出数据，那么就需要实现加载页面时自动加载findAll方法
        // 而之前我们已经知道了，Vue的声明周期中，最早可以操作methods和data中的数据的阶段是：created生命周期函数阶段。
        // 那么在这里调用findAll方法即可
        this.findAll();
    },
    methods: {
        // 查询所有列表数据
        findAll(){
            this.$http.get('findAll').then(result => {
                this.list = result.body;
            });
        },

        // 添加功能
        add(){
            this.$http.post('add', {username: this.username}).then(result => {
                if(result.body.status == 0){
                    // 如果状态码为0就表示请求成功，这个状态码的值根据实际定
                    // 请求成功，即添加了一条新的数据，那么需要重新刷新列表（不然新数据不能及时的更新到页面上）
                    this.findAll()
                }else{
                    alert('添加失败');
                }
            })
        },

        //删除功能
        del(id){
            this.$http.get('del' + id).then(result => {
                if(result.body.status == 0){
                    //请求成功
                    //刷新列表
                    this.findAll();
                }else{
                    alert('删除失败');
                }
            })
        }
    }
});