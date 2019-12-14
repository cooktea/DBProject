var data = {
    login:false,
    userInfo:{

    },
    projects:[],
    showFrom:false
};

var vm = new Vue({
    el:'#app',
    data:data,
    methods: {
        getUserInfo:function (callback) {
            axios.get("/teacher")
                .then(function (value) {
                    console.log(value);
                    console.log(this);
                    if (value.data == ""){
                        this.vm.login = false;
                    } else {
                        this.vm.login = true;
                        this.vm.userInfo = value.data;
                        callback();
                    }
                })
        }
    }
});
