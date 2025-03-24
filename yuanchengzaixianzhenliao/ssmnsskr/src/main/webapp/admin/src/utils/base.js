const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmnsskr/",
            name: "ssmnsskr",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmnsskr/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "远程在线诊疗系统小程序"
        } 
    }
}
export default base
